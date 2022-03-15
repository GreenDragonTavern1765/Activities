package edu.temple.activityswitching

import android.content.Intent
import android.content.res.Resources
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), viewListener {

    private lateinit var photoAdapter: PhotoAdapter
    var name: String? = null
    var description: String? = null
    var image: Image? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 4)
        photoAdapter = PhotoAdapter(applicationContext, this)
        recyclerView.adapter = photoAdapter
        photoAdapter.setDataList()
    }

    override fun onItemClick(photo: PhotoObject) {
        val intent = Intent(this, DisplayActivity::class.java)
        startActivity(intent)
    }
}