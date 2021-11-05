package com.emptycoder.ja3.data.repository

import com.emptycoder.ja3.data.model.MealsDTO
import com.emptycoder.ja3.data.remote.MealSearchAPI
import com.emptycoder.ja3.domain.repository.MealSearchRepository

class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}