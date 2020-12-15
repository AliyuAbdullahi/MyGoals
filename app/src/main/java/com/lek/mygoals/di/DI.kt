package com.lek.mygoals.di

import com.lek.mygoals.data.GoalRepository
import com.lek.mygoals.data.GoalService
import com.lek.mygoals.data.IGoalService

object DI {
    private val service: IGoalService = GoalService()
    val repo: GoalRepository = GoalRepository(service)
}
