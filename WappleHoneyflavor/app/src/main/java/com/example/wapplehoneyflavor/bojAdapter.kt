package com.example.wapplehoneyflavor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise.boj

class bojAdapter(val context: Context, val bojList : ArrayList<boj>) : RecyclerView.Adapter<bojAdapter.Holder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.boj_list,parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return bojList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.qtext.text = bojList[position].question
        holder.atext.text = bojList[position].answer
    }

    inner class Holder(v:View) : RecyclerView.ViewHolder(v)
    {
        val qtext = v.findViewById<TextView>(R.id.qtext)
        val atext = v.findViewById<TextView>(R.id.atext)
    }
}
