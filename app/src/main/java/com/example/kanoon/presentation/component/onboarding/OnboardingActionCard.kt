package com.example.kanoon.presentation.component.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kanoon.ui.theme.OnboardingCardBackground

@Composable
fun OnboardingActionCard(
    startButtonText: String,
    onNavigationClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .offset(y = 100.dp)
            .width(344.dp)
            .height(70.dp),
        colors = CardDefaults.cardColors(
            containerColor = OnboardingCardBackground
        ),
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = startButtonText,
                    modifier = Modifier.weight(1f),
                    color = Color.White,
                    fontSize = 20.sp
                )

                OnboardingNavigationButton(onClick = onNavigationClick)
            }
        }
    }
}