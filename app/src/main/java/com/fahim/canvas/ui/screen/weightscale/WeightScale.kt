package com.fahim.canvas.ui.screen.weightscale

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WeightScale() {
    var weight by remember {
        mutableStateOf(80)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Scale(
            style = ScaleStyle(
                scaleWidth = 150.dp
            ),
            modifier = Modifier
                .fillMaxSize()
                .height(300.dp)
                .align(Alignment.BottomCenter)
        ) {
            weight = it

        }
    }

}

@Preview
@Composable
private fun Preview_WeightScale() {
    WeightScale()

}