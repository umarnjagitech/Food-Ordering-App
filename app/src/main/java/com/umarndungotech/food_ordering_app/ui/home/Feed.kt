package com.umarndungotech.food_ordering_app.ui.home

import android.health.connect.ReadRecordsRequestUsingFilters
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberBasicTooltipState
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.umarndungotech.food_ordering_app.models.Filter
import com.umarndungotech.food_ordering_app.models.FoodCollection
import com.umarndungotech.food_ordering_app.models.FoodRepo
import com.umarndungotech.food_ordering_app.ui.components.FilterBar

@Composable
fun Feed(
    modifier: Modifier = Modifier,
    onFoodClick:(Long) -> Unit,
) {
    val foodCollection = remember {
        FoodRepo.getFoods()
    }
    val filters = remember {
        FoodRepo.getFilters()
    }
}


@Composable
private fun Feed(
    foodCollection: List<FoodCollection>,
    filters: List<Filter>,
    onFoodClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface (
        modifier = modifier.fillMaxSize()
    ){
        Box{

        }

    }
}


@Composable
private fun FoodCollectionList(
    foodCollection: List<FoodCollection>,
    filters: List<Filter>,
    modifier: Modifier = Modifier
) {
    var filtersVisible by rememberSaveable {
        mutableStateOf(false)
    }
    Box(modifier = modifier) {
        LazyColumn {
            // For scrollable Data
            item {
                Spacer(
                    modifier = Modifier
                        .windowInsetsTopHeight(
                            WindowInsets.statusBars.add(WindowInsets(top=56.dp))
                        )
                )
                FilterBar(filter = filters) {
                    filtersVisible = true
                }
            }
            itemsIndexed(foodCollection) {index: Int, foodCollection: FoodCollection ->
                if (index > 0){
                    Divider(thickness = 2.dp)
                }
            }
        }
    }

}