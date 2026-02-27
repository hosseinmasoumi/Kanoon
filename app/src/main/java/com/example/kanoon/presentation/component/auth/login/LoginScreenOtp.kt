package com.example.kanoon.presentation.component.auth.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kanoon.R
import com.example.kanoon.ui.theme.KanoonTheme
import com.example.kanoon.ui.theme.OnboardingCardBackground

@Composable
fun LoginScreenOtp(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
    onConfirmClick: () -> Unit = {},
    onResendClick: () -> Unit = {}
) {
    // فعلاً یک State داخلی تعریف کردیم تا UI قابل تست باشد
    var otpValue by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        IconButton(
            onClick = onBackClick,
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_arrow),
                contentDescription = null,
                tint = Color.Black
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.signup_otp_message),
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                ),
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // فیلد ورودی OTP
            OtpInputField(
                otpText = otpValue,
                onOtpTextChange = {
                    if (it.length <= 5) otpValue = it
                }
            )

            Spacer(modifier = Modifier.height(64.dp))

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
}

@Composable
fun OtpInputField(
    otpText: String,
    onOtpTextChange: (String) -> Unit
) {
    BasicTextField(
        value = otpText,
        onValueChange = onOtpTextChange,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        decorationBox = {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                modifier = Modifier.fillMaxWidth()
            ) {
                repeat(5) { index ->
                    val char = when {
                        index >= otpText.length -> ""
                        else -> otpText[index].toString()
                    }

                    OtpBox(
                        text = char,
                        isFocused = index == otpText.length
                    )
                }
            }
        }
    )
}

@Composable
fun OtpBox(
    text: String,
    isFocused: Boolean
) {
    Box(
        modifier = Modifier
            .size(width = 60.dp, height = 70.dp)
            .border(
                width = if (isFocused) 2.dp else 1.dp,
                color = if (isFocused) OnboardingCardBackground else OnboardingCardBackground.copy(alpha = 0.5f),
                shape = RoundedCornerShape(12.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        )
    }
}
@Preview(showBackground = true)
@Composable
fun SignupStep3ScreenPreview() {
    KanoonTheme {
        LoginScreenOtp()
    }
}