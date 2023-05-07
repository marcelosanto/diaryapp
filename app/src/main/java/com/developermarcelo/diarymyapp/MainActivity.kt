package com.developermarcelo.diarymyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.developermarcelo.diarymyapp.navigation.Screen
import com.developermarcelo.diarymyapp.navigation.SetupNavGraph
import com.developermarcelo.diarymyapp.ui.theme.DiaryMyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        setContent {
            DiaryMyAppTheme {
                val navController = rememberNavController()
                SetupNavGraph(
                    startDestination = Screen.Authentication.route,
                    navHostController = navController
                )
            }
        }
    }
}

