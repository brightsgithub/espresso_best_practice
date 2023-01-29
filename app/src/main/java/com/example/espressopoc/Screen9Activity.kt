package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen9)

        val subtext = "Some random subtext for screen 9"
        val titleTextView = findViewById<TextView>(R.id.titleTextView9)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView9)
        val nextButton = findViewById<Button>(R.id.nextButton9)

        titleTextView.text = "Screen 9"
        subtextTextView.text = subtext
        nextButton.text = "submit"
        nextButton.setOnClickListener{
            // Add code here for what should happen when the submit button is clicked
            startActivity(Screen10Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen9Activity::class.java)
        }
    }
}