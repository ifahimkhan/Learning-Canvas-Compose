package com.fahim.canvas.ui.screen.drawPath

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PathEffects() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        rotate(45f, pivot = Offset(200f, 200f)) {
            drawRect(
                color = Color.Red,
                topLeft = Offset(100f, 100f),
                size = Size(200f, 200f)
            )
        }
    }

}

@Preview
@Composable
private fun PreviewPathEffects() {
    PathEffects()
}