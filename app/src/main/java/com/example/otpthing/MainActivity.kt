package com.example.otpthing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.navigation.compose.rememberNavController
import com.example.otpthing.ui.theme.OTPThingTheme
import com.example.otpthing.viewModel.OTPViewModel


class MainActivity : ComponentActivity() {
    private val viewModel: OTPViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OTPThingTheme {
                val navController = rememberNavController()
                val startDestination = if (viewModel.isUserLoggedIn()) Routes.HomeScreen.route else Routes.CompleteDialogContent.route
                NavGraph(navController = navController, startDestination = startDestination)

            }
        }
    }
}



