package com.example.ecommerce_app.ui.components.search_input

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce_app.R
import com.example.ecommerce_app.ui.theme.Poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable()
fun SearchInput() {
    var search by remember { mutableStateOf("") }

    TextField(
        value = search,
        onValueChange = { search = it },
        leadingIcon = {
            Image(
                painter = painterResource(R.drawable.search),
                contentDescription = "Search",
                modifier = Modifier
                    .padding(start = 10.dp)
                    .scale(2.5f),
            )
        },
        trailingIcon = {
            Image(
                painter = painterResource(R.drawable.microphone),
                contentDescription = "Microphone",
                modifier = Modifier
                    .padding(end = 12.dp)
                    .scale(2.5f)
            )
        },
        placeholder = {
            Text(
                text = "Search",
                color = colorResource(R.color.placeholder),
                fontFamily = Poppins,
                fontSize = 16.sp
            )
        }, modifier = Modifier
            .width(404.dp)
            .height(57.dp),
        shape = RoundedCornerShape(40.dp),
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            containerColor = colorResource(R.color.primary)
        )
    )
}
