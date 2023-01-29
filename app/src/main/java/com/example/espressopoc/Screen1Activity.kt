package com.example.espressopoc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        val subtext = "Some random subtext"
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView)
        val nextButton = findViewById<Button>(R.id.nextButton)

        titleTextView.text = "Screen 1"
        subtextTextView.text = subtext
        nextButton.text = "Submit"

        nextButton.setOnClickListener {
            startActivity(Screen2Activity.getLaunchingIntent(this))
        }
    }
}
