package com.example.ecommerce_app.ui.components.shopping_cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce_app.R
import com.example.ecommerce_app.ui.theme.Poppins

@Composable()
fun ShoppingCart(
    count: String
) {
    Box(
        modifier = Modifier
            .padding(top = 0.dp)
            .height(65.dp)
    ) {
        Box(modifier = Modifier.padding(top = 6.dp)) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(
                        R.color.primary
                    ),
                )
            ) {
                Icon(
                    modifier = Modifier
                        .fillMaxSize()
                        .scale(1.7F, 1.7F),
                    painter = painterResource(id = R.drawable.shopping_cart),
                    contentDescription = "Shopping cart",
                    tint = colorResource(R.color.icon),
                )
            }
        }

        Row(
            modifier = Modifier.padding(start = 36.dp, bottom = 20.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp)
                    .background(
                        colorResource(R.color.red),
                        RoundedCornerShape(25.dp)
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = count,
                    color = colorResource(R.color.white),
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp,
                )
            }
        }
    }
}