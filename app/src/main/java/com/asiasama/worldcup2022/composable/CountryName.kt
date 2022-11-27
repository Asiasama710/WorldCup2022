package com.asiasama.worldcup2022.composable

import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CountryName(name: String){
    Text(
        text = name,
        fontSize = 14.sp,
        color = Color.White,
        fontFamily = FontFamily.Default,
        modifier =Modifier.width(50.dp)

    )
}