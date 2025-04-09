package com.umarndungotech.food_ordering_app.ui.components

import android.icu.text.ListFormatter.Width
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

fun Modifier.diagonalGradientBorder(
    colors: List<Color>,
    borderSize: Dp = 2.dp,
    shape: Shape
) = this.border(
    width = borderSize,
    brush = Brush.linearGradient(colors),
    shape = shape
)

fun Modifier.fadeInGradientBorder(
    showBorder: Boolean,
    colors: List<Color>,
    borderSize: Dp = 2.dp,
    shape: Shape
) = composed {
    val animatedColors = List(colors.size){i ->
        animateColorAsState(
            targetValue =
                if (showBorder) colors[i] else colors[i].copy(.5f),
            label = "animated Color"
        )
    }

    diagonalGradientBorder(colors, borderSize, shape)
}

@Composable
fun Modifier.offsetGradientBackground(
    colors: List<Color>,
    width: Float,
    offset: Float

) = background(
    brush = Brush.horizontalGradient(
        colors = colors,
        startX = -offset,
        endX = width - offset,
        tileMode = TileMode.Mirror
    )
)