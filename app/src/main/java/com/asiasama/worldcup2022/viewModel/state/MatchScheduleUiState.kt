package com.asiasama.worldcup2022.viewModel.state

data class MatchScheduleUiState(
    val firstCountryName: String,
    val secondCountryName: String,
    val firstCountryImageId: Int,
    val secondCountryImageId: Int,
    val timeSchedule: String,
    val dateSchedule: String
)
data class MatchesUiState(
   val matches: List<MatchScheduleUiState> = emptyList()
)
