package com.asiasama.worldcup2022

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asiasama.worldcup2022.composable.Background
import com.asiasama.worldcup2022.composable.TopBar
import com.asiasama.worldcup2022.screen.MatchScheduleScreen
import com.asiasama.worldcup2022.ui.theme.WorldCup2022Theme


@Preview(showSystemUi = true)
@Composable
fun WorldCup2022App() {
    WorldCup2022Theme {
        Scaffold()
        {
            Background()
            Column {
                TopBar()
                MatchScheduleScreen()
            }

        }
    }

}