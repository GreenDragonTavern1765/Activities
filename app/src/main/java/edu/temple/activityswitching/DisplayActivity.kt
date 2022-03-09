package edu.temple.activityswitching

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}