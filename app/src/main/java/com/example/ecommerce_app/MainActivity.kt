package com.example.ecommerce_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecommerce_app.ui.components.bottom_navigation.BottomNavigation
import com.example.ecommerce_app.ui.screens.home.HomeScreen
import com.example.ecommerce_app.ui.theme.EcommerceAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EcommerceAppTheme {
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Scaffold(
                        bottomBar = {
                            BottomNavigation(navController)
                        },
                        floatingActionButtonPosition = FabPosition.Center,
                        floatingActionButton = {
                            FloatingActionButton(
                                shape = CircleShape,
                                contentColor = colorResource(R.color.secondary),
                                containerColor = colorResource(R.color.secondary),
                                onClick = {},
                                modifier = Modifier
                                    .width(70.dp)
                                    .height(70.dp)
                                    .offset(0.dp, 70.dp)
                                    .border(
                                        width = 6.dp,
                                        shape = CircleShape,
                                        color = Color.Black
                                    )
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.code_icon),
                                    contentDescription = null,
                                    tint = Color.Black,
                                    modifier = Modifier
                                        .width(21.dp)
                                        .height(21.dp)
                                )
                            }
                        }
                    )
                    { innerPadding ->
                        NavHost(
                            navController = navController,
                            startDestination = "home",
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            composable(Screen.Home.route) { HomeScreen(navController) }
                        }
                    }
                }
            }
        }
    }
}
