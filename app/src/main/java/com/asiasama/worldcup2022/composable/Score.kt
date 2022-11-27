package com.asiasama.worldcup2022.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun Score(text: String){
    Text(
        text =text,
        fontSize = 24.sp,
        color = Color.White,
        fontWeight = FontWeight.ExtraBold
    )
}