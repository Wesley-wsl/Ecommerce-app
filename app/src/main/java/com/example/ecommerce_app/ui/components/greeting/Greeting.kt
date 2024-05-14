package com.example.ecommerce_app.ui.components.greeting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce_app.R

@Composable()
fun Greeting(
    name: String
) {
    Column() {
        Text(
            text = "Hello,",
            fontSize = 18.sp,
            color = colorResource(R.color.textSecondary)
        )
        Text(
            text = name,
            style = MaterialTheme.typography.titleLarge,
            color = colorResource(
                R.color.textPrimary
            ),
            modifier = Modifier.padding(top = 3.dp)
        )
    }
}