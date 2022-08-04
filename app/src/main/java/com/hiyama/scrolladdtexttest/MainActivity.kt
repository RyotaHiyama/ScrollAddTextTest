package com.hiyama.scrolladdtexttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ScrollView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val scrollView :ScrollView = findViewById(R.id.scrollview)
    }

    fun sendText(view: View) {
        val texts = TextView(this)
        texts.text = sendText.text.toString()
        ll.addView(texts)
        scrollview.fullScroll(ScrollView.FOCUS_DOWN)
    }

}