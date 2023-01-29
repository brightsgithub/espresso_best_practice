package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        val subtext = "Some random subtext for screen 4"
        val titleTextView = findViewById<TextView>(R.id.titleTextView4)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView4)
        val nextButton2 = findViewById<Button>(R.id.nextButton4)

        titleTextView.text = "Screen 4"
        subtextTextView.text = subtext
        nextButton2.text = "submit"
        nextButton2.setOnClickListener{
            startActivity(Screen5Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen4Activity::class.java)
        }
    }
}