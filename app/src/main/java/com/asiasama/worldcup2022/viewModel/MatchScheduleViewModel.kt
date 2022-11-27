package com.asiasama.worldcup2022.viewModel

import androidx.lifecycle.ViewModel
import com.asiasama.worldcup2022.R
import com.asiasama.worldcup2022.viewModel.state.MatchScheduleUiState
import com.asiasama.worldcup2022.viewModel.state.MatchesUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class MatchScheduleViewModel : ViewModel() {

    private val _state = MutableStateFlow(MatchesUiState())
    val state = _state.asStateFlow()

    init {
        getMatches()
    }
    fun getMatches() {
        _state.update {
            it.copy(
                matches = listOf(
                    MatchScheduleUiState(
                        "Britain",
                        "Italy",
                        R.drawable.britain,
                        R.drawable.italy,
                        "10:00",
                        "27 Aug 2022"
                    ),
                    MatchScheduleUiState(
                        "Turkey",
                        "Canada",
                        R.drawable.turkey,
                        R.drawable.canada,
                        "01:30",
                        "27 Aug 2022"
                    ),
                    MatchScheduleUiState(
                        "Brazil",
                        "Thailand",
                        R.drawable.brazil,
                        R.drawable.thailand,
                        "03:00",
                        "28 Aug 2022"
                    ),
                    MatchScheduleUiState(
                        "Spain",
                        "Portugal",
                        R.drawable.spain,
                        R.drawable.portugal,
                        "07:00",
                        "29 Aug 2022"
                    ),
                    MatchScheduleUiState(
                        "Sweden",
                        "China",
                        R.drawable.sweden,
                        R.drawable.china,
                        "05:00",
                        "30 Aug 2022"
                    ),
                    MatchScheduleUiState(
                        "Saudi",
                        "Serbia",
                        R.drawable.saudi,
                        R.drawable.serbia,
                        "10:00",
                        "30 Aug 2022"
                    ),
                    MatchScheduleUiState(
                        "Britain",
                        "Italy",
                        R.drawable.britain,
                        R.drawable.italy,
                        "10:00",
                        "27 Aug 2022"
                    ),
                    MatchScheduleUiState(
                        "Sweden",
                        "China",
                        R.drawable.sweden,
                        R.drawable.china,
                        "05:00",
                        "30 Aug 2022"
                    ),
                )
            )
        }
    }
}