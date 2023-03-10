package com.example.timetracker.presentation.common.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.timetracker.presentation.ui.theme.Dimens
import com.example.timetracker.presentation.ui.theme.Gray
import com.example.timetracker.presentation.ui.theme.Paddings
import com.example.timetracker.presentation.ui.theme.Shapes
import com.example.timetracker.presentation.ui.theme.VioletRed

@Composable
fun CredentialsRoundTextField(
    modifier: Modifier = Modifier,
    text: String?,
    labelId: Int? = null,
    hintId: Int? = null,
    isLabelVisible: Boolean = true,
    isHintVisible: Boolean = true,
    imeAction: ImeAction,
    keyboardType: KeyboardType,
    onValueChange: (String) -> Unit,
    textStyle: TextStyle = TextStyle(),
    singleLine: Boolean = true,
    onNextClicked: () -> Unit = {},
    onDoneClicked: () -> Unit = {}
) {
    var isPasswordHidden by remember { mutableStateOf(true) }
    var focusBorderColor by remember { mutableStateOf(VioletRed) }

    Box(
        modifier = modifier.padding(Paddings.PADDING_8)
    ) {
        TextField(value = text ?: "",
            label = {
                if (isLabelVisible) {
                    val label = labelId?.let { stringResource(id = labelId) } ?: ""
                    Text(text = label, style = textStyle)
                }
            },
            placeholder = {
                if (isHintVisible) {
                    val hint = hintId?.let { stringResource(id = hintId) } ?: ""
                    Text(
                        text = hint,
                        style = textStyle,
                        color = MaterialTheme.colorScheme.surface
                    )
                }
            },
            singleLine = singleLine,
            textStyle = textStyle,
            visualTransformation = if (isPasswordHidden && keyboardType == KeyboardType.Password) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            },
            trailingIcon = {
                if (keyboardType == KeyboardType.Password) {
                    Icon(
                        modifier = Modifier.clickable() {
                            isPasswordHidden = !isPasswordHidden
                        },
                        imageVector = if (isPasswordHidden) Icons.Default.Visibility
                        else Icons.Default.VisibilityOff,
                        tint = if (isPasswordHidden) MaterialTheme.colorScheme.onSurface
                        else MaterialTheme.colorScheme.primary,
                        contentDescription = null
                    )
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                textColor = MaterialTheme.colorScheme.primary,
                unfocusedLabelColor = MaterialTheme.colorScheme.onSurface,
                focusedLabelColor = MaterialTheme.colorScheme.onSurface,
                cursorColor = MaterialTheme.colorScheme.primary
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = imeAction, keyboardType = keyboardType
            ),
            keyboardActions = KeyboardActions(onNext = { onNextClicked() },
                onDone = { onDoneClicked() }),
            onValueChange = onValueChange,
            modifier = Modifier
                .border(
                    width = Dimens.DIMEN_1,
                    shape = Shapes.large,
                    color = focusBorderColor
                )
                .height(Dimens.DIMEN_70)
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.background,
                    shape = Shapes.large
                )
                .onFocusChanged {
                    focusBorderColor = if (it.isFocused) VioletRed else Gray
                })
    }
}
