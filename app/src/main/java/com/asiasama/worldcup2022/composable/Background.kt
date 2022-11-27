package com.asiasama.worldcup2022.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.asiasama.worldcup2022.R
import com.asiasama.worldcup2022.ui.theme.backgroundLinerBottom
import com.asiasama.worldcup2022.ui.theme.backgroundLinerTop

@Composable
fun Background(){
    Box(
        modifier = Modifier.fillMaxSize()
            .background(brush = Brush.verticalGradient(listOf(
                backgroundLinerTop, backgroundLinerBottom
            )))) {

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = stringResource(R.string.background),
            contentScale = ContentScale.Crop,
            alpha = 0.1f

        )

    }
}