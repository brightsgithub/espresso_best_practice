package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen7)

        val subtext = "Some random subtext for screen 7"
        val titleTextView = findViewById<TextView>(R.id.titleTextView7)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView7)
        val nextButton2 = findViewById<Button>(R.id.nextButton7)

        titleTextView.text = "Screen 7"
        subtextTextView.text = subtext
        nextButton2.text = "submit"
        nextButton2.setOnClickListener{
            startActivity(Screen8Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen7Activity::class.java)
        }
    }
}