package com.example.kanoon.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.kanoon.R
import com.example.kanoon.ui.theme.OnboardingButtonBackground
import com.example.kanoon.ui.theme.OnboardingCardBackground

@Composable
fun OnboardingBottomBar(
    navController: NavHostController,
    welcomeTitle: String,
    questionText: String,
    description: String,
    startButtonText: String
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
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
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

                Button(
                    onClick = {navController.navigate("OnboardingPage2") },
                    shape = CircleShape,
                    modifier = Modifier.size(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = OnboardingButtonBackground,
                    ),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = null,
                        modifier = Modifier.size(
                            30.dp
                        )
                    )
                }
            }
        }
    }
}