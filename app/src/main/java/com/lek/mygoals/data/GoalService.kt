package com.lek.mygoals.data

import com.lek.mygoals.model.Goal

class GoalService : IGoalService {

    private val goals = hashMapOf<Int, Goal>()

    override fun getGoals(id: Int): Goal? = goals[id]

    override fun goals(): List<Goal> = goals.values.toList()

    override fun addGoal(goal: Goal) {
        goals[goal.id] = goal
    }

    override fun deleteGoal(goal: Goal) {
        goals.remove(goal.id)
    }
}
