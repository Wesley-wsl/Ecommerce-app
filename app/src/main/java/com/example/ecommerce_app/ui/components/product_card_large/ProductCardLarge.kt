package com.example.ecommerce_app.ui.components.product_card_large

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
fun ProductCardLarge() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(116.dp)
            .background(
                color = colorResource(R.color.primary),
                shape = RoundedCornerShape(20.dp)
            ),
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(R.drawable.headphone),
            contentDescription = "Watch",
            modifier = Modifier
                .width(117.dp)
                .height(115.dp)
                .background(Color.Transparent, RoundedCornerShape(15))
        )

        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
            Text(
                text = "Snopy Headphone",
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily(Font(R.font.poppins_medium)),
                color = colorResource(R.color.textPrimary),
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Snopy SN- BT96 Pretty Back Bluetooth Headphone",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                color = colorResource(R.color.textSecondary),
                modifier = Modifier.padding(bottom = 4.dp),
                lineHeight = 18.sp
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
                    color = colorResource(R.color.white),
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