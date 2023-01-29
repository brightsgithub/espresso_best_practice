package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen6)

        val subtext = "Some random subtext for screen 6"
        val titleTextView = findViewById<TextView>(R.id.titleTextView6)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView6)
        val nextButton2 = findViewById<Button>(R.id.nextButton6)

        titleTextView.text = "Screen 6"
        subtextTextView.text = subtext
        nextButton2.text = "submit"
        nextButton2.setOnClickListener{
            startActivity(Screen7Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen6Activity::class.java)
        }
    }
}