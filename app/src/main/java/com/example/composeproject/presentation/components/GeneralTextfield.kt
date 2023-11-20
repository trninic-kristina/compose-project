package com.example.composeproject.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneralTextField(label: String, onTextInput: (String) -> Unit) {

    var text by rememberSaveable {
        mutableStateOf("")
    }
    TextField(
        value = text,
        onValueChange = { value ->
            onTextInput.invoke(value)
            text = value
        },
        colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
        label = { Text(text = label, fontSize = 20.sp, color = Color.DarkGray) },
        modifier = Modifier.fillMaxWidth(0.9f)
    )
}

@Preview
@Composable
fun PreviewGeneralTextField() {
}