package edu.temple.activityswitching

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), viewListener {

    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<PhotoObject>()
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
        fillDataList()
        photoAdapter.setDataList(dataList)
    }

    fun fillDataList() {
        dataList.add(PhotoObject("Arryn","The Eyrie", R.drawable.arryn))
        dataList.add(PhotoObject("Baratheon","Dragonstone", R.drawable.stannis))
        dataList.add(PhotoObject("Baratheon","Storm's End", R.drawable.baratheon))
        dataList.add(PhotoObject("Blackfyre","Kings Landing", R.drawable.blackfyre))
        dataList.add(PhotoObject("Bolton","Dreadfort", R.drawable.bolton))
        dataList.add(PhotoObject("Cerwyn","Castle Cerwyn", R.drawable.cerwyn))
        dataList.add(PhotoObject("Clegane","Clegane Keep", R.drawable.clegane))
        dataList.add(PhotoObject("Corbray","Hearts Home", R.drawable.corbray))
        dataList.add(PhotoObject("Dayne","Starfall", R.drawable.dayne))
        dataList.add(PhotoObject("Frey","The Twins", R.drawable.frey))
        dataList.add(PhotoObject("Glover","Deepwood Mott", R.drawable.glover))
        dataList.add(PhotoObject("Grafton","Gulltown", R.drawable.grafton))
        dataList.add(PhotoObject("Greyjoy","Iron Islands", R.drawable.greyjoy))
        dataList.add(PhotoObject("Hightower","Oldtown", R.drawable.hightower))
        dataList.add(PhotoObject("Karstark","Karhold", R.drawable.karstark))
        dataList.add(PhotoObject("Lannister","Casterly Rock", R.drawable.lannister))
        dataList.add(PhotoObject("Mallister", "Seagard", R.drawable.mallister))
        dataList.add(PhotoObject("Martell","Dorne", R.drawable.martell))
        dataList.add(PhotoObject("Mormont","Bear Island", R.drawable.mormont))
        dataList.add(PhotoObject("Royce","Runestone", R.drawable.royce))
        dataList.add(PhotoObject("Stark","Winterfell", R.drawable.stark))
        dataList.add(PhotoObject("Targaryen","Dragonstone", R.drawable.targaryen))
        dataList.add(PhotoObject("Tarly","Horn Hill", R.drawable.tarly))
        dataList.add(PhotoObject("Tarth","Tarth", R.drawable.tarth))
        dataList.add(PhotoObject("Tollett","Grey Glen", R.drawable.tollett))
        dataList.add(PhotoObject("Tully","Riverrun", R.drawable.tully))
        dataList.add(PhotoObject("Tyrell","Highgarden", R.drawable.tyrell))
        dataList.add(PhotoObject("Umber","Last Hearth", R.drawable.umber))
    }

    override fun onItemClick(photo: PhotoObject) {
        val intent = Intent(this, DisplayActivity::class.java)
        startActivity(intent)
    }
}