package com.fahim.canvas.ui.screen.drawPath

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WritingTextOnPath() {
    val path = Path().apply {
        moveTo(0f, 800f)
        quadTo(600f, 400f, 1000f, 800f)


    }
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawContext.canvas.nativeCanvas.apply {
            drawTextOnPath(
                "Hello World!",
                path,
                30f,
                30f,
                Paint().apply {
                    color = Color.RED
                    textSize = 70f
                    textAlign = Paint.Align.CENTER
                }

            )
        }
    }
}

@Preview
@Composable
private fun PreviewPathText() {
    WritingTextOnPath()
}