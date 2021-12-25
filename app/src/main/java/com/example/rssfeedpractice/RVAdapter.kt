package com.example.rssfeeddemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rssfeedpractice.R
import kotlinx.android.synthetic.main.item_row.view.*

class RVAdapter(private var list: List<String>): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = list[position]

        holder.itemView.apply {
            feedTitle.text = item
        }
    }

    override fun getItemCount() = list.size

    fun update(list: List<String>){
        this.list = list
        notifyDataSetChanged()
    }
}