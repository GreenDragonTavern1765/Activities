package edu.temple.activityswitching

import android.content.Context
import android.content.Intent
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
    var dataList = emptyList<PhotoObject>()

    internal fun setDataList(dataList: List<PhotoObject>) {
        this.dataList = dataList
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