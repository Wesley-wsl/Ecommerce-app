package com.example.ecommerce_app.ui.components.category_card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce_app.R

@Composable()
fun CategoryCard() {
    Column(
        modifier = Modifier
            .width(195.dp)
            .height(239.dp)
            .background(color = colorResource(R.color.primary), shape = RoundedCornerShape(22.dp))
            .padding(bottom = 18.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.watch_category),
            contentDescription = null,
            modifier = Modifier
                .width(196.dp)
                .height(182.dp)
        )

        Text(text = "Electronics", fontSize = 18.sp, textAlign = TextAlign.Center, modifier = Modifier.padding(top = 13.dp))
    }
}