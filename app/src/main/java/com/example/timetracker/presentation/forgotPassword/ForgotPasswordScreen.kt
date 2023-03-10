package com.example.timetracker.presentation.forgotPassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController
import com.example.timetracker.R
import com.example.timetracker.presentation.common.components.CredentialsRoundTextField
import com.example.timetracker.presentation.common.components.TopNavBar
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.White

@Composable
fun ForgotPasswordScreen(
    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(PaddingValues(Dimens.DIMEN_40))
                .verticalScroll(rememberScrollState())
        ) {
            TopNavBar(
                onBackClicked = { navController.navigateUp() },
            )
            Text(
                text = stringResource(id = R.string.forgot_password),
                color = White,
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = stringResource(id = R.string.forgot_password_steps),
                color = White,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(Dimens.DIMEN_32))
            CredentialsRoundTextField(
                text = "A",
                labelId = R.string.email_label,
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email,
                onValueChange = { },
                onNextClicked = { },
                onDoneClicked = {}
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(modifier = Modifier
                .fillMaxWidth()
                .height(Dimens.DIMEN_56),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                ),
                shape = Shapes.large,
                onClick = {}) {
                Text(
                    modifier = Modifier.background(
                        color = Color.Transparent,
                        shape = Shapes.large
                    ),
                    text = stringResource(id = R.string.send_email),
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.labelSmall
                )
            }
            Spacer(modifier = Modifier.height(Dimens.DIMEN_40))
        }
    }
}
