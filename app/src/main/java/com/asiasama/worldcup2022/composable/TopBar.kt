package com.asiasama.worldcup2022.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.worldcup2022.R

@Preview
@Composable
fun TopBar(){
    Row(
        Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(16.dp).background(color = Color.Transparent),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Icons(painter = painterResource(id = R.drawable.ic_baseline_arrow_back_ios_24))
        Title(text = stringResource(R.string.title))
        Icons(painter = painterResource(id = R.drawable.ic_baseline_menu_24))
    }
}