package com.asiasama.worldcup2022.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.asiasama.worldcup2022.ui.theme.CardColor
import com.asiasama.worldcup2022.viewModel.state.MatchScheduleUiState

@Composable
fun ItemMatchSchedule(matchSchedule: MatchScheduleUiState){
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        backgroundColor = CardColor,
        elevation = 0.dp


    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,

            ) {

            CountryName(name = matchSchedule.firstCountryName)
            image(painter = painterResource(id =matchSchedule.firstCountryImageId),Modifier)
            TimeSchedule(matchSchedule.dateSchedule,matchSchedule.timeSchedule)
            image(painter = painterResource(id =matchSchedule.secondCountryImageId),Modifier)
            CountryName(name = matchSchedule.secondCountryName)
        }
    }
}