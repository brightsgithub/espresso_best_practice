package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val subtext = "Some random subtext for screen 2"
        val titleTextView = findViewById<TextView>(R.id.titleTextView2)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView2)
        val nextButton2 = findViewById<Button>(R.id.nextButton2)

        titleTextView.text = "Screen 2"
        subtextTextView.text = subtext
        nextButton2.text = "submit"
        nextButton2.setOnClickListener{
            startActivity(Screen3Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            return Intent(context, Screen2Activity::class.java)
        }
    }
}

