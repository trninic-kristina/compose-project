package com.example.composeproject.presentation.views.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composeproject.R
import com.example.composeproject.navigation.AppScreens
import com.example.composeproject.presentation.views.authentication.components.RegistrationCard
import com.example.composeproject.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreen(navController: NavController) {

    Scaffold(containerColor = Purple80) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(modifier = Modifier.fillMaxHeight(0.4f), contentAlignment = Alignment.Center) {
                    Image(painter = painterResource(R.drawable.welcome2), contentDescription = "")
                }
                RegistrationCard(onClick = { navController.navigate(AppScreens.LoginScreen.route) })
            }
        }

    }
}

@Preview
@Composable
fun PreviewRegistrationScreen() {
}