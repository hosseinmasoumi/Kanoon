package com.example.kanoon.presentation.component.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.kanoon.R
import com.example.kanoon.ui.theme.OnboardingButtonBackground

@Composable
fun OnboardingNavigationButton(
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        shape = CircleShape,
        modifier = Modifier.size(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = OnboardingButtonBackground
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.arrow_right),
            contentDescription = null,
            modifier = Modifier.size(30.dp)
        )
    }
}