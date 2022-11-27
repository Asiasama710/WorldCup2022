package com.asiasama.worldcup2022.composable

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import com.asiasama.worldcup2022.R

@Composable
fun Icons(painter: Painter){
    Icon(
        painter = painter,
        contentDescription = stringResource(R.string.descriptionIcone),
        tint = Color.White
    )
}