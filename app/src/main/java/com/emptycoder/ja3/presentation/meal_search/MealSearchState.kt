package com.emptycoder.ja3.presentation.meal_search

import com.emptycoder.ja3.domain.model.Meal

data class MealSearchState(
    val isLoading: Boolean = false,
    val data: List<Meal>? = null,
    val error: String = ""
)