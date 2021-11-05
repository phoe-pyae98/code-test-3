package com.emptycoder.ja3.domain.repository

import com.emptycoder.ja3.data.model.MealsDTO

interface MealDetailsRepository {

    suspend fun getMealDetails(id:String):MealsDTO

}