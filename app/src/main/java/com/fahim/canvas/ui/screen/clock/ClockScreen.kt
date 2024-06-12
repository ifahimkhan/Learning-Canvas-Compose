package com.fahim.canvas.ui.screen.clock

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import java.util.Calendar

@Composable
fun ClockScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        var currentTime = remember {
            Calendar.getInstance()
        }
        var seconds by remember {
            mutableStateOf(currentTime.get(Calendar.SECOND).toFloat())
        }
        var minutes by remember {
            mutableStateOf(currentTime.get(Calendar.MINUTE).toFloat())
        }
        var hours by remember {
            mutableStateOf(currentTime.get(Calendar.HOUR_OF_DAY).toFloat())
        }

        LaunchedEffect(seconds) {
            delay(1000L)
            currentTime = Calendar.getInstance()
            seconds = currentTime.get(Calendar.SECOND).toFloat()
            minutes = currentTime.get(Calendar.MINUTE).toFloat()
            hours = currentTime.get(Calendar.HOUR_OF_DAY).toFloat()


        }

        Clock(
            seconds = seconds,
            minutes = minutes,
            hours = hours
        )
    }
}

@Preview
@Composable
fun preview_Clock() {
    ClockScreen()
}