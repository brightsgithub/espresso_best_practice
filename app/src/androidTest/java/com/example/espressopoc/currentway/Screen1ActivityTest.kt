package com.example.espressopoc.currentway

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.espressopoc.R
import com.example.espressopoc.Screen1Activity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Screen1ActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(Screen1Activity::class.java)

    @Test
    fun testScreen1Elements() {
        // Check that the title text view has the correct text
        onView(withId(R.id.titleTextView)).check(matches(withText("Screen 1")))

        // Check that the subtext text view has the correct text
        onView(withId(R.id.subtextTextView)).check(matches(withText("Some random subtext")))

        // Check that the next button has the correct text
        onView(withId(R.id.nextButton)).check(matches(withText("Submit")))

        // Click the next button and check that the Screen2Activity is launched
        onView(withId(R.id.nextButton)).perform(click())
        onView(withId(R.id.titleTextView2)).check(matches(isDisplayed()))

        // Perform press back button action
        Espresso.pressBack()

        // Check if the current activity is Screen1Activity
        onView(withId(R.id.titleTextView)).check(matches(withText("Screen 1")))
    }
}