package com.example.ecommerce_app.ui.screens.categories

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ecommerce_app.ui.components.category_card.CategoryCard
import com.example.ecommerce_app.ui.components.search_input.SearchInput


@Composable
fun CategoriesScreen(navController: NavController) {
//    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
//            .verticalScroll(state = scrollState)
            .padding(start = 20.dp, top = 13.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(end = 24.dp, top = 14.dp)
                .background(Color.Transparent)
        ) {
            SearchInput()
        }

        Text(
            text = "Categories",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 8.dp, top = 19.dp)
        )

        Column(modifier = Modifier.height(800.dp)) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                ) {
                items(6) {
                    Box(modifier = Modifier.padding(bottom = 16.dp, end = 16.dp)) {
                        CategoryCard()
                    }
                }
            }
        }

    }
}