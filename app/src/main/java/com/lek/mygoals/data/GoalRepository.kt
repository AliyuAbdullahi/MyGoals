package com.lek.mygoals.data

import com.lek.mygoals.model.Goal

class GoalRepository(private val goalService: IGoalService) {

    fun goals(): List<Goal> = goalService.goals()

    fun addGoal(goal: Goal) = goalService.addGoal(goal)
}
