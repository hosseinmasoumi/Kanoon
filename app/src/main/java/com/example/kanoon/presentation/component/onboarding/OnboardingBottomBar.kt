package com.example.kanoon.presentation.component.onboarding

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun OnboardingBottomBar(
    navController: NavHostController,
    welcomeTitle: String,
    questionText: String,
    description: String,
    startButtonText: String,
    okButtonText: String,
    nextPage: String
) {
    OnboardingTitleSection(
        welcomeTitle = welcomeTitle,
        questionText = questionText,
        description = description
    )

    OnboardingActionCard(
        okButtonText = okButtonText,
        startButtonText = startButtonText,
        onNavigationClick = { navController.navigate(nextPage) }
    )
}