package com.example.birthdaywish

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.birthdaywish.ui.theme.BirthDayWishTheme

class BirthdayGreetingActivity : ComponentActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name = intent.getStringExtra(NAME_EXTRA)
        val inputtxt = findViewById<TextView>(R.id.birthdayGreeting)
        inputtxt.text = "Happy birthday $name !"
    }
}

