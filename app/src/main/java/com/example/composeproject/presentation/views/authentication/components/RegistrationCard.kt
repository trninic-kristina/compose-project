package com.example.composeproject.presentation.views.authentication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeproject.R
import com.example.composeproject.presentation.components.CustomElevatedButton
import com.example.composeproject.presentation.components.GeneralTextField
import com.example.composeproject.ui.theme.Purple40

@Composable
fun RegistrationCard(onClick: () -> Unit) {

    Card(modifier = Modifier.fillMaxSize(), colors = CardDefaults.cardColors(Color.White)) {
        Box(contentAlignment = Alignment.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                GeneralTextField(label = stringResource(R.string.first_name), onTextInput = {})
                Spacer(modifier = Modifier.padding(10.dp))
                GeneralTextField(label = stringResource(R.string.last_name), onTextInput = {})
                Spacer(modifier = Modifier.padding(10.dp))
                GeneralTextField(label = stringResource(R.string.email), onTextInput = {})
                Spacer(modifier = Modifier.padding(10.dp))
                GeneralTextField(label = stringResource(R.string.password), onTextInput = {})
                Spacer(modifier = Modifier.fillMaxHeight(0.3f))
                CustomElevatedButton(
                    onButtonClick = { /*TODO*/ },
                    label = stringResource(R.string.register)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = stringResource(R.string.registration_question))
                    TextButton(onClick = onClick) {
                        Text(
                            text = stringResource(R.string.sign_in),
                            color = Purple40,
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewRegistrationCard() {
}