package com.example.otpthing

sealed class Routes(val route: String) {
    object HomeScreen : Routes("home")
    object LoginDialog : Routes("loginDialog")
    object CompleteDialogContent : Routes("completedialoguecontent")

}