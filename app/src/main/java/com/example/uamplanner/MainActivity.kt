package com.example.uamplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.uamplanner.ui.theme.UAMPlannerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UAMPlannerTheme {
                PantallaInicio()
            }
        }
    }
}