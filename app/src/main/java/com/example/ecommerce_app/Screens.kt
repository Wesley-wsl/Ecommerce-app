package com.example.ecommerce_app

import androidx.annotation.StringRes

sealed class Screen(val route: String, @StringRes val resourceId: Int?, val icon: Int?) {
    object Home : Screen("home", null, R.drawable.home_icon)
    object Categories : Screen("categories", null, R.drawable.search_icon)
    object Code : Screen("code", null, null)
    object Favorites : Screen("favorites", null, R.drawable.heart_icon)
    object Profile : Screen("profile", null, R.drawable.profile_icon)
}

val bottomItems = listOf<Screen>(
    Screen.Home,
    Screen.Categories,
    Screen.Code,
    Screen.Favorites,
    Screen.Profile,
)
