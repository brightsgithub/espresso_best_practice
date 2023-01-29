package com.example.espressopoc

import android.content.Intent
import androidx.test.platform.app.InstrumentationRegistry
class TestUtils {
    companion object {
        fun launchScreen(intent: Intent) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addCategory(Intent.CATEGORY_LAUNCHER)
            intent.action = Intent.ACTION_MAIN
            InstrumentationRegistry.getInstrumentation().startActivitySync(intent)
        }
    }
}