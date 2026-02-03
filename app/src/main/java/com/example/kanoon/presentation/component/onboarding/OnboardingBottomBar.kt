package com.example.kanoon.presentation.component.onboarding

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun OnboardingBottomBar(
    navController: NavHostController,
    welcomeTitle: String,
    questionText: String,
    description: String,
    startButtonText: String
) {
    OnboardingTitleSection(
        welcomeTitle = welcomeTitle,
        questionText = questionText,
        description = description
    )

    OnboardingActionCard(
        startButtonText = startButtonText,
        onNavigationClick = { navController.navigate("OnboardingPage2") }
    )
}