package com.example.kanoon.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.kanoon.R

@Composable
fun BackgroundCurve(
    size: Dp = 400.dp,
    offsetX: Dp = 0.dp,
    offsetY: Dp = 0.dp,
    imageRes: Int = R.drawable.ellipse3,
    contentScale: ContentScale = ContentScale.Fit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // بک‌گراند منحنی
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = contentScale,
            modifier = Modifier
                .size(size)
                .offset(x = offsetX, y = offsetY)
                .align(Alignment.CenterStart)
        )
    }
}