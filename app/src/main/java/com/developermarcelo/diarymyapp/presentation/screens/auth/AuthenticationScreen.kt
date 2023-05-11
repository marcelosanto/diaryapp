package com.developermarcelo.diarymyapp.presentation.screens.auth

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.developermarcelo.diarymyapp.util.Constants.CLIENT_ID
import com.stevdzasan.messagebar.ContentWithMessageBar
import com.stevdzasan.messagebar.MessageBarState
import com.stevdzasan.onetap.OneTapSignInState
import com.stevdzasan.onetap.OneTapSignInWithGoogle

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun AuthenticationScreen(
    loadingState: Boolean,
    messageBarState: MessageBarState,
    oneTapState: OneTapSignInState,
    onButtonClicked: () -> Unit
) {
    Scaffold(content = {
        ContentWithMessageBar(messageBarState = messageBarState) {
            AuthenticationContent(loadingState, onButtonClicked)
        }
    })

    OneTapSignInWithGoogle(state = oneTapState,
        clientId = CLIENT_ID,
        onTokenIdReceived = { tokenId ->
            Log.d("Auth", "AuthenticationScreen: $tokenId")
        },
        onDialogDismissed = { message ->
            Log.d("Auth", "AuthenticationScreen: $message")
        })
}