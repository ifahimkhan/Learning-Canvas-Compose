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

@Composable
fun ClockScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val milliseconds = remember {
            System.currentTimeMillis()
        }
        var seconds by remember {
            mutableStateOf((milliseconds / 1000f) % 60f)
        }
        var minutes by remember {
            mutableStateOf(((milliseconds / 1000f) / 60f) % 60f)
        }
        var hours by remember {
            mutableStateOf(((milliseconds / 1000f) / 3600f) % 60f)
        }

        LaunchedEffect(key1 = seconds) {
            delay(1000L)
            minutes += 1f / 60f
            hours += 1f / (60f * 60f * 12f)
            seconds += 1f
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