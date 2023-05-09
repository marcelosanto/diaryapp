package com.developermarcelo.diarymyapp.presentation.screens.auth

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun AuthenticationScreen(loadingState: Boolean, onButtonClicked: () -> Unit) {
    Scaffold(content = {
        AuthenticationContent(loadingState, onButtonClicked)
    })
}