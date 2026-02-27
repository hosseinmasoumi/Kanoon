package com.example.kanoon.presentation.component.auth.login.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.kanoon.R
import com.example.kanoon.ui.theme.OnboardingCardBackground

@Composable
fun OtpActions(
    onConfirmClick: () -> Unit,
    onResendClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = onConfirmClick,
            modifier = Modifier.size(width = 160.dp, height = 56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = OnboardingCardBackground)
        ) {
            Text(
                text = stringResource(id = R.string.signup_otp_confirm),
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = onResendClick,
            modifier = Modifier.size(width = 220.dp, height = 56.dp),
            shape = RoundedCornerShape(24.dp),
            border = BorderStroke(1.dp, OnboardingCardBackground.copy(alpha = 0.5f))
        ) {
            Text(
                text = stringResource(id = R.string.signup_otp_resend),
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = OnboardingCardBackground,
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}
