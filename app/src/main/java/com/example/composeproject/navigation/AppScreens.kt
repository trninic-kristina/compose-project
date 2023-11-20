package com.example.composeproject.navigation

sealed class AppScreens(val route: String) {

    object LoginScreen : AppScreens("login_screen")
    object RegistrationScreen : AppScreens("registration_screen")

}
