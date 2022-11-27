package com.asiasama.worldcup2022.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
fun TimeSchedule(date: String, time: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = date,
            fontSize = 12.sp,
            color = Color.White,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Center

        )
        Text(
            text = time,
            fontSize = 12.sp,
            color = Color.White,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Center
        )
    }
}