package com.example.kanoon.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.kanoon.R

@Composable
fun OnboardingPage1(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column {

            Box(
                modifier = Modifier.fillMaxSize(),

                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.robot),
                    contentDescription = "AI Robot",
                    modifier = Modifier
                        .padding(bottom = 25.dp)
                        .width(250.dp)
                        .height(250.dp),
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun OnboardingPage1Preview() {
    val navController = rememberNavController()
    OnboardingPage1(navController = navController)
}