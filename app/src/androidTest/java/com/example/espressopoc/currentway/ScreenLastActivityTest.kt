package com.example.espressopoc.currentway

import android.content.Context
import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.espressopoc.R
import com.example.espressopoc.Screen10Activity
import com.example.espressopoc.Screen1Activity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Before

@RunWith(AndroidJUnit4::class)
class ScreenLastActivityTest {

    private val num = 10

    @get:Rule
    val activityRule = ActivityTestRule(Screen1Activity::class.java)

    private lateinit var context: Context
    @Before
    fun setUp() {
        context = InstrumentationRegistry.getInstrumentation().targetContext
    }

    @Test
    fun verifyScreenElementsAndNavigation() {
        // BAD Navigation
        launchMyScreen()

        // Check that the title text view has the correct text
        onView(withId(R.id.titleTextView10)).check(matches(withText("Screen $num")))

        // Check that the subtext text view has the correct text
        onView(withId(R.id.subtextTextView10)).check(matches(withText("Some random subtext for screen $num")))

        // Check that the next button has the correct text
        onView(withId(R.id.nextButton10)).check(matches(withText("submit")))

        // Click the next button and check that the Screen10Activity is launched
        onView(withId(R.id.nextButton10)).perform(click())
    }

    private fun launchMyScreen() {
        onView(withId(R.id.nextButton)).perform(click())
        onView(withId(R.id.nextButton2)).perform(click())
        onView(withId(R.id.nextButton3)).perform(click())
        onView(withId(R.id.nextButton4)).perform(click())
        onView(withId(R.id.nextButton5)).perform(click())
        onView(withId(R.id.nextButton6)).perform(click())
        onView(withId(R.id.nextButton7)).perform(click())
        onView(withId(R.id.nextButton8)).perform(click())
        onView(withId(R.id.nextButton9)).perform(click())
    }
}