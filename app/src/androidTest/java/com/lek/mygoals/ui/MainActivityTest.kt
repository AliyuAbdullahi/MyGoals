package com.lek.mygoals.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.lek.mygoals.R
import org.junit.Assert.*
import org.junit.Test

class MainActivityTest {

    @Test
    fun whenGoalScreenIsLaunchedGoalScreenIsVisible() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun whenAddGoalButtonIsClickedAddGoalsScreenIsDisplayed() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.addGoalButton)).perform(click())
        onView(withId(R.id.titleLayout)).check(matches(isDisplayed()))
    }

    @Test
    fun whenGoalIsAddedGoalCanBeObservedInGoalsScreen() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.addGoalButton)).perform(click())
        onView(withId(R.id.titleText)).perform(typeText("My Goal title"))
        closeSoftKeyboard()
        onView(withId(R.id.descriptionText)).perform(typeText("This is the goal of the day"))
        closeSoftKeyboard()
        onView(withId(R.id.createGoalButton)).perform(click())
        onView(withId(R.id.addGoalButton)).check(matches(isDisplayed()))
    }

}
