package com.emptycoder.ja3.presentation.meal_details

import com.emptycoder.ja3.domain.model.MealDetails

data class MealDetailsState(
    val isLoading: Boolean = false,
    val data: MealDetails? = null,
    val error: String = ""
) {
}