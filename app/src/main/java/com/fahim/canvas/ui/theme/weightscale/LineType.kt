package com.fahim.canvas.ui.theme.weightscale

sealed class LineType {
    object Normal: LineType()
    object FiveStep: LineType()
    object TenStep: LineType()
}