package com.umarndungotech.food_ordering_app.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SweepGradient
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.umarndungotech.food_ordering_app.models.CollectionType
import com.umarndungotech.food_ordering_app.models.FoodCollection
import com.umarndungotech.food_ordering_app.models.FoodItem
import com.umarndungotech.food_ordering_app.models.foodItems
import com.umarndungotech.food_ordering_app.ui.theme.Caramel40
import com.umarndungotech.food_ordering_app.ui.theme.Caramel80
import com.umarndungotech.food_ordering_app.ui.theme.Orange40
import com.umarndungotech.food_ordering_app.ui.theme.Orange80
import com.umarndungotech.food_ordering_app.ui.theme.pacificoFont
import java.security.Provider

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
        if (highlight && foodCollection.type == CollectionType.Highlight){
            // Show food item
        } else {
            // Show Normal Food Item
        }
    }
}

@Composable
fun HighlightedFood(
    modifier: Modifier,
    index: Int,
    foodItem: List<FoodItem>,
    onFoodClick: (Long) -> Unit,
) {
    val rowState = rememberLazyListState()
    val cardWidthWithPaddingPx = with(LocalDensity.current){
        cardWidthWithPaddingPx
    }
    val scrollProvide = {
        val offsetFromStart = cardWidthWithPaddingPx * rowState.firstVisibleItemIndex
        offsetFromStart + rowState.firstVisibleItemScrollOffset
    }

    val gradient = when((index / 2) % 2 ){
        0 -> listOf(Orange80, Caramel40, Caramel80, Orange40)
        else -> listOf(Caramel80, Caramel40, Orange40, Orange80)
    }

    LazyRow(
        state = rowState,
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
    ) {
        itemsIndexed(foodItems){index, foodItem ->

        }
    }
}


@Composable
private fun HighlightedFoodItems(
    modifier: Modifier = Modifier,
    foodItem: FoodItem,
    onFoodClick: (Long) -> Unit,
    index: Int,
    gradient: List<Color>,
    scrollProvider: () -> Float,
) {
    Card(
        modifier = modifier
            .size(width = HighLightCardWidth, height = 250.dp)
            .padding(bottom = 16.dp)
    ) {

    }
}



















