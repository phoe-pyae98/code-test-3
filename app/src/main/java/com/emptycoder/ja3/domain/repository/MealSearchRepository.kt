package com.emptycoder.ja3.domain.repository

import com.emptycoder.ja3.data.model.MealsDTO
import com.emptycoder.ja3.domain.model.Meal

interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO



}