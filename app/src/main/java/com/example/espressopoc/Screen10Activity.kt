package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Screen10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen10)

        val subtext = "Some random subtext for screen 10"
        val titleTextView = findViewById<TextView>(R.id.titleTextView10)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView10)
        val nextButton = findViewById<Button>(R.id.nextButton10)

        titleTextView.text = "Screen 10"
        subtextTextView.text = subtext
        nextButton.text = "submit"
        nextButton.setOnClickListener{
            Toast.makeText(this, "FINISHED!", Toast.LENGTH_LONG).show()
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen10Activity::class.java)
        }
    }
}