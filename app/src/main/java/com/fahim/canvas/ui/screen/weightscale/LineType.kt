package com.fahim.canvas.ui.screen.weightscale

sealed class LineType {
    object Normal: LineType()
    object FiveStep: LineType()
    object TenStep: LineType()
}