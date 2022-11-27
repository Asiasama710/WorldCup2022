package com.asiasama.worldcup2022.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.worldcup2022.R
import com.asiasama.worldcup2022.ui.theme.CardColor

@Preview(widthDp = 360)
@Composable
fun ItemCard() {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth(),
        backgroundColor = CardColor,
        elevation = 0.dp


    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,

            ) {

            ImageCard(
                image = painterResource(id = R.drawable.germany), countryName = stringResource(
                    R.string.germany
                )
            )
            Score(text = stringResource(R.string.score_reasult))
            ImageCard(
                image = painterResource(id = R.drawable.japan),
                countryName = stringResource(R.string.japan)
            )

        }
    }
}

