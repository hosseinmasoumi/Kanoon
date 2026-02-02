package com.example.kanoon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.kanoon.presentation.onboarding.OnboardingPage1
import com.example.kanoon.ui.theme.KanoonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KanoonTheme {
                OnboardingPage1(navController = rememberNavController())
            }
        }
    }
}

