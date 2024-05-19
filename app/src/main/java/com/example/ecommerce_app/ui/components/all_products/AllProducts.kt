package com.example.ecommerce_app.ui.components.all_products

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app.ui.components.product_card_large.ProductCardLarge


@Composable()
fun AllProducts(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .height(500.dp)
                .padding(end = 24.dp)
        ) {
            Text(
                text = "All",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp, top = 22.dp)
            )

            LazyColumn(verticalArrangement = Arrangement.spacedBy(20.dp)) {
                items(4) { _ ->
                    ProductCardLarge()
                }
            }
        }
    }
}


