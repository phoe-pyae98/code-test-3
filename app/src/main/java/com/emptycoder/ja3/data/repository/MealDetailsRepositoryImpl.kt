package com.emptycoder.ja3.data.repository

import com.emptycoder.ja3.data.model.MealsDTO
import com.emptycoder.ja3.data.remote.MealSearchAPI
import com.emptycoder.ja3.domain.repository.MealDetailsRepository

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}