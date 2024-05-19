package com.example.ecommerce_app.ui

import androidx.annotation.StringRes
import com.example.ecommerce_app.R


sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("home", R.string.home)
}


