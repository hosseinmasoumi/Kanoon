package com.example.kanoon.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kanoon.R
import com.example.kanoon.presentation.component.BackgroundCurve

@Composable
fun OnboardingPage1() {

    BackgroundCurve(size = 800.dp, offsetY = (-80).dp)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.robot),
            contentDescription = "AI Robot",
            modifier = Modifier
                .size(280.dp)
                .offset(y = 60.dp)
        )
        OnboardingBottomBar()
        Box(modifier = Modifier.weight(0.8f))
    }
}


@Preview(
    name = "Samsung Galaxy A51",
    showSystemUi = true,
    showBackground = true,
    device = "spec:width=1080px,height=2400px,dpi=405",
    locale = "en"
)
@Composable
private fun OnboardingPage1Preview() {
    OnboardingPage1()
}