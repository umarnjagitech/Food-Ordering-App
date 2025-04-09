package com.umarndungotech.food_ordering_app.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.umarndungotech.food_ordering_app.models.FoodCollection
import com.umarndungotech.food_ordering_app.ui.theme.pacificoFont

private val HighLightCardWidth = 170.dp
private val HighLightCardPadding = 16.dp
private val Density.cardWidthWithPaddingPx
    get() = (HighLightCardWidth + HighLightCardPadding).toPx()


@Composable
fun FoodCollection(
    modifier: Modifier = Modifier,
    foodCollection: FoodCollection,
    onFoodClick: (Long) -> Unit,
    index: Int = 0,
    highlight: Boolean = true
) {
    Column(
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .heightIn(min = 56.dp)
                .padding(start = 24.dp)
        ) {
            Text(
                text = foodCollection.name,
                style = MaterialTheme.typography.headlineSmall,
                fontFamily = pacificoFont,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .weight(1f)
                    .wrapContentWidth(Alignment.Start)
            )
            IconButton(
                onClick = {},
                modifier = Modifier.align(
                    Alignment.CenterVertically
                )
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowForward,
                    contentDescription = null
                )
            }
        }
    }
}