package com.asiasama.worldcup2022.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

@Composable
fun Title(text: String){
    Text(
        text = text,
        fontSize = 14.sp,
        color = Color.White,
        fontFamily = FontFamily.Cursive
    )
}