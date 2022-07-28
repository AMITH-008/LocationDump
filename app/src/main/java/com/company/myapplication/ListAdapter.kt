package com.company.myapplication

import android.view.View
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private var dates:ArrayList<String>, private var description:ArrayList<String>, private var latitude:ArrayList<String>, private var longitude:ArrayList<String>): RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    class MyViewHolder(view:View) : RecyclerView.ViewHolder(view){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyViewHolder{
        val layoutInflator = LayoutInflater.from(parent.context)
        val view = layoutInflator.inflate(R.layout.item_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun getItemCount():Int {
        return users.size
    }
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }
}