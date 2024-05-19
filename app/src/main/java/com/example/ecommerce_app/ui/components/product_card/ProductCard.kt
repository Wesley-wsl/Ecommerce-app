package com.example.ecommerce_app.ui.components.product_card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce_app.R

@Composable()
fun ProductCard() {
    Column(
        modifier = Modifier
            .width(154.dp)
            .height(206.dp)
            .background(
                color = colorResource(R.color.primary),
                shape = RoundedCornerShape(14, 14, 10, 10)
            )
    ) {
        Image(
            painter = painterResource(R.drawable.watch),
            contentDescription = "Watch",
            modifier = Modifier
                .width(154.dp)
                .height(148.dp)
                .background(Color.Transparent, RoundedCornerShape(15))
        )

        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 5.dp)) {
            Text(
                text = "Sport Band",
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily(Font(R.font.poppins_medium)),
                color = colorResource(R.color.textPrimary),
                modifier = Modifier.padding(bottom = 2.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$2499",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                    color = colorResource(R.color.white)
                )
                Image(
                    painter = painterResource(R.drawable.heart),
                    contentDescription = "Heart",
                    modifier = Modifier
                        .width(15.dp)
                        .height(15.dp)
                )
            }
        }

    }

}