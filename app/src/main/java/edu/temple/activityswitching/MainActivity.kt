package edu.temple.activityswitching

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<PhotoObject>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 4)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter
    }
}