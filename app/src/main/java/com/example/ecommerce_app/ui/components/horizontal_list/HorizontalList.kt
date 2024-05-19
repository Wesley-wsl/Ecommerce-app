package com.example.ecommerce_app.ui.components.horizontal_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app.ui.components.product_card.ProductCard


@Composable()
fun HorizontalList(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Featured",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LazyRow(horizontalArrangement = Arrangement.spacedBy(15.dp)) {
            items(4) { _ ->
                ProductCard()
            }
        }
    }
}