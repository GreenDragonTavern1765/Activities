package edu.temple.activityswitching

import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import java.util.Optional.empty

interface viewListener {
    fun onItemClick(photo: PhotoObject)
}

class PhotoAdapter(var context : Context, val listener: viewListener) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    private var dataList = mutableListOf<PhotoObject>()
    private var houseNames = context.resources.getStringArray(R.array.houseNames)
    private var houseSeats = context.resources.getStringArray(R.array.houseSeats)
    private var houseSigils = mutableListOf<Int>()

    internal fun setSigilList() {
        houseSigils.add(R.drawable.arryn)
        houseSigils.add(R.drawable.stannis)
        houseSigils.add(R.drawable.baratheon)
        houseSigils.add(R.drawable.blackfyre)
        houseSigils.add(R.drawable.bolton)
        houseSigils.add(R.drawable.cerwyn)
        houseSigils.add(R.drawable.clegane)
        houseSigils.add(R.drawable.corbray)
        houseSigils.add(R.drawable.dayne)
        houseSigils.add(R.drawable.frey)
        houseSigils.add(R.drawable.glover)
        houseSigils.add(R.drawable.grafton)
        houseSigils.add(R.drawable.greyjoy)
        houseSigils.add(R.drawable.hightower)
        houseSigils.add(R.drawable.karstark)
        houseSigils.add(R.drawable.lannister)
        houseSigils.add(R.drawable.mallister)
        houseSigils.add(R.drawable.martell)
        houseSigils.add(R.drawable.mormont)
        houseSigils.add(R.drawable.royce)
        houseSigils.add(R.drawable.stark)
        houseSigils.add(R.drawable.targaryen)
        houseSigils.add(R.drawable.tarly)
        houseSigils.add(R.drawable.tarth)
        houseSigils.add(R.drawable.tollett)
        houseSigils.add(R.drawable.tully)
        houseSigils.add(R.drawable.tyrell)
        houseSigils.add(R.drawable.umber)
    }

    internal fun setDataList() {
        setSigilList()
        for (i in 0..27) {
            var temp = PhotoObject(
                houseNames[i],
                houseSeats[i],
                houseSigils[i])
            dataList.add(temp)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var name: TextView
        var description: TextView
        init {
            image = itemView.findViewById(R.id.cardImage)
            name = itemView.findViewById(R.id.title)
            description = itemView.findViewById(R.id.desc)
        }
        fun bind(photo: PhotoObject, listener: viewListener) {
            itemView.setOnClickListener { listener.onItemClick(photo) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = dataList[position]
        holder.name.text = data.name
        holder.description.text = data.description
        holder.image.setImageResource(data.image)
        holder.bind(data, listener)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}


