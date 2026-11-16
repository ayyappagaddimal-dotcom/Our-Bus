package com.mybus.india

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.mybus.india.navigation.AppNav
import com.mybus.india.ui.theme.MyBusTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MyBusTheme { AppNav() } }
    }
}
