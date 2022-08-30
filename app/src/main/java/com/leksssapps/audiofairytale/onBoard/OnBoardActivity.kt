package com.leksssapps.audiofairytale.onBoard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.leksssapps.audiofairytale.R

/**
 * Экран онбординга
 */
class OnBoardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            onBoarding()
        }
    }

    @Preview
    @Composable
    private fun onBoarding(){
        Column() {
           Image(
               painter = painterResource(id = R.drawable.ic_month),
               contentDescription = ""
           )
        }
    }
}