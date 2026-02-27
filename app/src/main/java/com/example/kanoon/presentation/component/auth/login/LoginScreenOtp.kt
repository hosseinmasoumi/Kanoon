package com.example.kanoon.presentation.component.auth.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kanoon.presentation.component.auth.login.components.OtpActions
import com.example.kanoon.presentation.component.auth.login.components.OtpHeader
import com.example.kanoon.presentation.component.auth.login.components.OtpInputField
import com.example.kanoon.ui.theme.KanoonTheme

@Composable
fun LoginScreenOtp(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
    onConfirmClick: () -> Unit = {},
    onResendClick: () -> Unit = {}
) {
    var otpValue by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // بخش هدر (دکمه بازگشت و متن راهنما)
        OtpHeader(onBackClick = onBackClick)

        Spacer(modifier = Modifier.height(32.dp))

        // فیلد ورودی کد تایید
        OtpInputField(
            otpText = otpValue,
            onOtpTextChange = {
                if (it.length <= 5) otpValue = it
            }
        )

        Spacer(modifier = Modifier.height(64.dp))

        // دکمه‌های عملیاتی (تایید و ارسال مجدد)
        OtpActions(
            onConfirmClick = onConfirmClick,
            onResendClick = onResendClick
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenOtpPreview() {
    KanoonTheme {
        LoginScreenOtp()
    }
}
