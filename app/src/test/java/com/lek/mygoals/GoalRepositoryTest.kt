package com.lek.mygoals

import com.lek.mygoals.data.GoalRepository
import com.lek.mygoals.data.IGoalService
import com.lek.mygoals.model.Goal
import io.mockk.*
import org.junit.Test

class GoalRepositoryTest {
    // get goals
    // add daily goals
    // delete goal(s)

    private val goalService: IGoalService = mockk<IGoalService>()

    private val availableGoals = listOf(Goal(1, "First goal", "Goal of the day"))

    @Test
    fun `when GoalRepository-goals is invoked - available goals are returned`() {
        every { goalService.goals() } returns  availableGoals
        val goalRepo = GoalRepository(goalService)
        val result = goalRepo.goals()

        assert(result == availableGoals)
    }

    @Test
    fun `when GoalRepository-addGoal is invoked - the goal is added to the store`() {
        val goalRepo = GoalRepository(goalService)
        every { goalService.addGoal(any()) } just runs
        val sampleGoal = Goal(1, "First goal", "Goal of the day")
        goalRepo.addGoal(sampleGoal)
        verify { goalService.addGoal(sampleGoal) }
    }
}
