package com.example.timetracker.presentation.resetPassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.timetracker.R
import com.example.timetracker.presentation.common.components.CredentialsRoundTextField
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.TextSizes
import com.example.timetracker.presentation.ui.theme.VioletRed
import com.example.timetracker.presentation.ui.theme.White
import com.example.timetracker.presentation.ui.theme.fonts

@Composable
fun ResetPasswordScreen(
    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(PaddingValues(Dimens.DIMEN_40))
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = stringResource(id = R.string.reset_password),
                color = White,
                style = TextStyle(
                    fontFamily = fonts, fontWeight = FontWeight.Bold, fontSize = TextSizes.SIZE_32
                )
            )
            Spacer(modifier = Modifier.height(Dimens.DIMEN_32))
            CredentialsRoundTextField(text = "A",
                labelId = R.string.new_password_label,
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Password,
                onValueChange = { },
                onNextClicked = { },
                onDoneClicked = {})
            CredentialsRoundTextField(text = "A",
                labelId = R.string.confirm_new_password_label,
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Password,
                onValueChange = { },
                onNextClicked = { },
                onDoneClicked = {})
            Spacer(modifier = Modifier.weight(1f))
            Button(modifier = Modifier
                .fillMaxWidth()
                .height(Dimens.DIMEN_56),
                colors = ButtonDefaults.buttonColors(
                    containerColor = VioletRed,
                ),
                shape = Shapes.large,
                onClick = {}) {
                Text(
                    modifier = Modifier.background(
                        color = Color.Transparent, shape = Shapes.large
                    ),
                    text = stringResource(id = R.string.reset_password),
                    color = White,
                    style = TextStyle(
                        fontFamily = fonts,
                        fontWeight = FontWeight.Bold,
                        fontSize = TextSizes.SIZE_14
                    )
                )
            }
            Spacer(modifier = Modifier.height(Dimens.DIMEN_40))
        }
    }
}
