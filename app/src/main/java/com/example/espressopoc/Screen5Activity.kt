package com.example.espressopoc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen5)

        val subtext = "Some random subtext for screen 5"
        val titleTextView = findViewById<TextView>(R.id.titleTextView5)
        val subtextTextView = findViewById<TextView>(R.id.subtextTextView5)
        val nextButton2 = findViewById<Button>(R.id.nextButton5)

        titleTextView.text = "Screen 5"
        subtextTextView.text = subtext
        nextButton2.text = "submit"
        nextButton2.setOnClickListener{
            startActivity(Screen6Activity.getLaunchingIntent(this))
        }
    }

    companion object {
        fun getLaunchingIntent(context: Context) : Intent {
            //if(1 >0 ) throw java.lang.RuntimeException("Forced Error!")
            return Intent(context, Screen5Activity::class.java)
        }
    }
}