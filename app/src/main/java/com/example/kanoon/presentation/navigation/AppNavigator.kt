import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kanoon.presentation.onboarding.OnboardingPage1
import com.example.kanoon.presentation.onboarding.OnboardingPage2
import com.example.kanoon.presentation.onboarding.OnboardingPage3

@Composable
fun AppNavigator(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "OnboardingPage1"
    ) {
        composable("OnboardingPage1") {
            // رفع مشکل: پاس دادن navController به صفحه
            OnboardingPage1(navController = navController)
        }

        // وقتی صفحه دوم را ساختی، به این شکل اضافه کن:
        composable("OnboardingPage2") {
            OnboardingPage2(navController = navController)
        }
        // وقتی صفحه دوم را ساختی، به این شکل اضافه کن:
        composable("OnboardingPage3") {
            OnboardingPage3(navController = navController)
        }
    }
}