package com.lek.mygoals.data

import com.lek.mygoals.model.Goal

interface IGoalService {
    fun getGoals(id: Int): Goal?
    fun goals(): List<Goal>
    fun addGoal(goal: Goal)
    fun deleteGoal(goal: Goal)
}
