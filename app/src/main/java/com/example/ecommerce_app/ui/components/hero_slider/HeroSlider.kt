package com.example.ecommerce_app.ui.components.hero_slider

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app.R

@OptIn(ExperimentalFoundationApi::class)
@Composable()
fun HeroSlider(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(pageCount = {
        4
    })

    Column(modifier = modifier) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .padding(end = 24.dp),
            pageSpacing = 20.dp
        ) { page ->
            Image(
                painter = painterResource(R.drawable.slide),
                contentDescription = "Slide $page",
                modifier = Modifier
                    .width(404.dp)
                    .height(159.dp),
                contentScale = ContentScale.Fit
            )
        }

        Row(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(bottom = 8.dp, end = 24.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color =
                    if (pagerState.currentPage == iteration) colorResource(R.color.secondary) else Color.LightGray
                Box(
                    modifier = Modifier
                        .padding(horizontal =  6.dp)
                        .padding(top = 5.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(8.5.dp)
                )
            }
        }
    }
}