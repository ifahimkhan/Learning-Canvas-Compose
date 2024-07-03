package com.fahim.canvas.ui.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.fahim.canvas.R

@Composable
fun CanvasImage() {
    val image = ImageBitmap.imageResource(id = R.drawable.asset)
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawImage(
            image = image,
            dstOffset = IntOffset(100, 100),
            dstSize = IntSize(
                (400 * (image.width.toFloat() / image.height)).toInt(), 400
            ),
            blendMode = BlendMode.Luminosity

        )
        drawCircle(
            color = Color.White,
            radius = 200f,
            center = Offset(200f, 200f),
            blendMode = BlendMode.Multiply
        )

    }

}

@Preview
@Composable
private fun Preview() {
    CanvasImage()
}