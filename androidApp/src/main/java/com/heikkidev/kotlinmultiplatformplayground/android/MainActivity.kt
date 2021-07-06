package com.heikkidev.kotlinmultiplatformplayground.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heikkidev.kotlinmultiplatformplayground.Greeting
import kotlinx.android.synthetic.main.activity_main.* // this allow us to get rid of findViewById!

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.text = greet()
    }
}
