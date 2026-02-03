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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController // اضافه شد
import androidx.navigation.compose.rememberNavController // اضافه شد
import com.example.kanoon.R
import com.example.kanoon.presentation.component.BackgroundCurve

@Composable
fun OnboardingPage1(navController: NavHostController) {

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
        OnboardingBottomBar(
            navController = navController,
            welcomeTitle = stringResource(R.string.onboarding_welcome_title),
            questionText = stringResource(R.string.onboarding_question),
            description = stringResource(R.string.app_description),
            startButtonText = stringResource(R.string.onboarding_button_start)
        )

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
    // رفع مشکل: ساخت یک navController مجازی برای نمایش در حالت Preview
    val navController = rememberNavController()
    OnboardingPage1(navController = navController)
}