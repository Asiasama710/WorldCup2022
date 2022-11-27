package com.asiasama.worldcup2022.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.asiasama.worldcup2022.composable.ItemCard
import com.asiasama.worldcup2022.composable.ItemMatchSchedule
import com.asiasama.worldcup2022.composable.ItemText
import com.asiasama.worldcup2022.viewModel.MatchScheduleViewModel
import com.asiasama.worldcup2022.viewModel.state.MatchesUiState


@Composable
fun MatchScheduleScreen(
    viewModel: MatchScheduleViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    MatchScheduleContent(state = state)
}


@Composable
fun MatchScheduleContent(
    state: MatchesUiState,
) {

    LazyColumn(
        Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            ItemCard()
            ItemText()
        }
        items(state.matches) {
            ItemMatchSchedule(matchSchedule = it)
        }
    }


}

