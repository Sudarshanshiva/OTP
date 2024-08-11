package com.example.otpthing

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.otpthing.OTPThing.HomeScreen

@Composable
fun NavGraph(navController: NavHostController, startDestination: String) {
    NavHost(navController = navController, startDestination = startDestination){
//        composable(Routes.LoginDialog.route){
//            LoginDialog(navController)
//        }
        composable(Routes.CompleteDialogContent.route){
            CompleteDialogContent(navController)
        }

        composable(Routes.HomeScreen.route){
            HomeScreen()
        }


    }
}