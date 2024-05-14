package com.example.ecommerce_app.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app.ui.components.greeting.Greeting
import com.example.ecommerce_app.ui.components.search_input.SearchInput
import com.example.ecommerce_app.ui.components.shopping_cart.ShoppingCart

@Composable()
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, top = 13.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(end = 26.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Greeting(name = "Jorkis")

            ShoppingCart(count = "5")
        }
        Box(modifier = Modifier.padding(end = 24.dp, top = 14.dp).background(Color.Transparent)) {
            SearchInput()
        }
    }
}