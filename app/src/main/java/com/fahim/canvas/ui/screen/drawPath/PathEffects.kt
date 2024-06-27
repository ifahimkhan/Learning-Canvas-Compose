package com.fahim.canvas.ui.screen.drawPath

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PathEffects() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val circle = Path().apply {
            addOval(Rect(center = Offset(400f, 400f), radius = 300f))
        }
        drawPath(
            path = circle,
            color = Color.Black,
            style = Stroke(width = 5.dp.toPx())
        )
        clipPath(
            path = circle,


            ) {

            drawRect(
                color = Color.Red,
                topLeft = Offset(400f, 0f),
                size = Size(400f, 400f)
            )

        }
    }

}

@Preview
@Composable
private fun PreviewPathEffects() {
    PathEffects()
}