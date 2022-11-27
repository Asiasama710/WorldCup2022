package com.asiasama.worldcup2022.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asiasama.worldcup2022.R

@Preview(widthDp = 360)
@Composable
fun ItemText(){
    Row(
        Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,

    ) {
        Text(
            text = stringResource(R.string.match_schedule),
            fontSize = 16.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            modifier = Modifier.alpha(0.5f),
            text = stringResource(R.string.see_all),
            fontSize = 14.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,

        )
    }
}