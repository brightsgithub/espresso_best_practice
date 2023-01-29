package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        val subtext = "Some random subtext for screen 3"
        val titleTextView = findViewById<TextView>(R.id.titleTextView3)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView3)
        val nextButton = findViewById<Button>(R.id.nextButton3)

        titleTextView.text = "Screen 3"
        subtextTextView.text = subtext
        nextButton.text = "submit"
        nextButton.setOnClickListener{
            startActivity(Screen4Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen3Activity::class.java)
        }
    }
}

