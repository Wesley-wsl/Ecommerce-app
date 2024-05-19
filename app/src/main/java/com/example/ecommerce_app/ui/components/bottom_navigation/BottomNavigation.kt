package com.example.ecommerce_app.ui.components.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.ecommerce_app.R
import com.example.ecommerce_app.bottomItems

@Composable()
fun BottomNavigation(navController: NavController) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(28.dp, 28.dp)),
        contentAlignment = Alignment.Center
    ) {
        NavigationBar(
            modifier = Modifier
                .height(71.dp)
                .fillMaxWidth(),
            containerColor = colorResource(R.color.primary),

            ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            bottomItems.forEach { screen ->
                NavigationBarItem(
                    modifier = Modifier.padding(top = 10.dp),
                    icon = {
                        screen.icon?.let {
                            Icon(
                                painter = painterResource(it),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(21.dp)
                                    .height(21.dp),
                                tint = if (currentDestination?.hierarchy?.any { it.route == screen.route } == true) colorResource(
                                    R.color.secondary
                                ) else Color.White
                            )
                        }
                    },
                    label = {
                        screen.resourceId?.let {
                            Text(
                                stringResource(
                                    it
                                )
                            )
                        }
                    },
                    selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = colorResource(id = R.color.primary)
                    ),
                    onClick = {
                        navController.navigate(screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                )
            }
        }
    }
}