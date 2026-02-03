package com.example.kanoon.presentation.component.onboarding

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnboardingTitleSection(
    welcomeTitle: String,
    questionText: String,
    description: String
) {
    Text(
        text = welcomeTitle,
        color = Color.Black,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.offset(y = 75.dp)
    )

    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = questionText,
        color = Color.Black,
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.offset(y = 90.dp)
    )

    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = description,
        color = Color.Black,
        maxLines = 2,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.offset(y = 120.dp)
    )

    Spacer(modifier = Modifier.height(50.dp))
}