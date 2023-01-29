package com.example.espressopoc.hybrid

import android.content.Context
import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.espressopoc.R
import com.example.espressopoc.Screen1Activity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.example.espressopoc.Screen7Activity
import com.example.espressopoc.Screen9Activity
import com.example.espressopoc.TestUtils
import org.junit.Before

@RunWith(AndroidJUnit4::class)
class Screen7ActivityHybridTest {

    private val num = 7

    @get:Rule
    val activityRule = ActivityTestRule(Screen1Activity::class.java)

    private lateinit var context: Context
    @Before
    fun setUp() {
        context = InstrumentationRegistry.getInstrumentation().targetContext
    }

    @Test
    fun verifyScreenElementsAndNavigation() {
        launchMyScreen()
        // Check that the title text view has the correct text
        onView(withId(R.id.titleTextView7)).check(matches(withText("Screen $num")))

        // Check that the subtext text view has the correct text
        onView(withId(R.id.subtextTextView7)).check(matches(withText("Some random subtext for screen $num")))

        // Check that the next button has the correct text
        onView(withId(R.id.nextButton7)).check(matches(withText("submit")))

        // Click the next button and check that the Screen8Activity is launched
        onView(withId(R.id.nextButton7)).perform(click())
        onView(withId(R.id.titleTextView8)).check(matches(isDisplayed()))

        // Perform press back button action
        Espresso.pressBack()

        // Check if the current activity is Screen7Activity
        onView(withId(R.id.titleTextView7)).check(matches(withText("Screen $num")))
    }

    private fun launchMyScreen() {
        TestUtils.launchScreen(
            Screen7Activity.getLaunchingIntent(
                InstrumentationRegistry.getInstrumentation().targetContext
            )
        )
    }
}