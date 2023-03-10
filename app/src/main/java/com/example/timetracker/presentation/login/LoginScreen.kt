package com.example.timetracker.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.timetracker.R
import com.example.timetracker.presentation.common.components.CredentialsRoundTextField
import com.example.timetracker.presentation.forgotPassword.nav.ForgotPasswordDestination
import com.example.timetracker.presentation.timesheet.nav.TimesheetDestination
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Shapes

@Composable
fun LoginScreen(
    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(PaddingValues(Dimens.DIMEN_40))
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier.size(Dimens.DIMEN_160),
                    painter = painterResource(id = R.drawable.app_logo),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = stringResource(id = R.string.hello),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = stringResource(id = R.string.login_tip),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyLarge,

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
            Spacer(modifier = Modifier.height(Dimens.DIMEN_12))
            CredentialsRoundTextField(
                text = "A",
                labelId = R.string.password_label,
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Password,
                onValueChange = { },
                onNextClicked = { },
                onDoneClicked = { },
            )
            Spacer(modifier = Modifier.height(Dimens.DIMEN_32))
            Text(
                text = stringResource(id = R.string.forgot_password),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(Alignment.CenterVertically)
                    .clickable {
                        navController.navigate(ForgotPasswordDestination.route)
                    }
            )
            Spacer(modifier = Modifier.height(Dimens.DIMEN_32))
            Button(modifier = Modifier
                .fillMaxWidth()
                .height(Dimens.DIMEN_56),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                ),
                shape = Shapes.large,
                onClick = {
                    navController.navigate(TimesheetDestination.route)
                }
            ) {
                Text(
                    modifier = Modifier.background(
                        color = Color.Transparent,
                        shape = Shapes.large
                    ),
                    text = stringResource(id = R.string.sign_in),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.labelSmall
                )
            }
            Spacer(modifier = Modifier.height(Dimens.DIMEN_40))
        }
    }
}
