package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen8)

        val subtext = "Some random subtext for screen 8"
        val titleTextView = findViewById<TextView>(R.id.titleTextView8)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView8)
        val nextButton2 = findViewById<Button>(R.id.nextButton8)

        titleTextView.text = "Screen 8"
        subtextTextView.text = subtext
        nextButton2.text = "submit"
        nextButton2.setOnClickListener{
            startActivity(Screen9Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen8Activity::class.java)
        }
    }
}