package edu.temple.activityswitching

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.Optional.empty

class PhotoAdapter(var context : Context) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    var dataList = empty<PhotoObject>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var name: TextView
        var description: TextView
        init {
            image = itemView.findViewById(R.id.cardImage)
            name = itemView.findViewById(R.id.title)
            description = itemView.findViewById(R.id.desc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}