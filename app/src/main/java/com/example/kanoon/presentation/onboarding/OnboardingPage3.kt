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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.kanoon.R
import com.example.kanoon.presentation.component.BackgroundCurve
import com.example.kanoon.presentation.component.onboarding.OnboardingBottomBar

@Composable
fun OnboardingPage3(navController: NavHostController) {

    BackgroundCurve(
        size = 800.dp,
        offsetY = (-80).dp,
        imageRes = R.drawable.ellipse3,
        contentScale = ContentScale.FillBounds
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.cart),
            contentDescription = "Shopping Cart",
            modifier = Modifier
                .size(280.dp)
                .offset(y = 60.dp)
        )

        OnboardingBottomBar(
            navController = navController,
            welcomeTitle = stringResource(R.string.onboarding_placeholder),
            questionText = stringResource(R.string.onboarding_benefits),
            description = stringResource(R.string.app_description),
            startButtonText = "بزن بریم",
            okButtonText = "باشه",
            nextPage = "OnboardingPage1"  // یا هر صفحه بعدی که دارید
        )

        Box(modifier = Modifier.weight(0.8f))
    }
}


@Preview(
    name = "Samsung Galaxy A51",
    showSystemUi = true,
    showBackground = true,
    device = "spec:width=1080px,height=2400px,dpi=405",
    locale = "fa"
)
@Composable
private fun OnboardingPage3Preview() {
    val navController = rememberNavController()
    OnboardingPage3(navController = navController)
}