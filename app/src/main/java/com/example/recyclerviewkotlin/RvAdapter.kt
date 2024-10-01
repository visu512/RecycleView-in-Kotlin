package com.example.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.recyclerviewkotlin.databinding.RvItemBinding

class RvAdapter(var dataList:ArrayList<RvModel>,var context: Context): RecyclerView.Adapter<RvAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//      var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
//        return MyViewHolder(view)
        var binding = RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // call anim function
        anim(holder.itemView)

        // set image and text  data
        holder.binding.profile.setImageResource(dataList.get(position).profile)
        holder.binding.name.text = dataList.get(position).name
        holder.binding.address.text = dataList.get(position).address


    }
    inner class MyViewHolder(var binding : RvItemBinding): RecyclerView.ViewHolder(binding.root)

    // show animated recyclerview
    fun anim(view: View){
    var animation = AlphaAnimation(0.0f,1.0f)
        animation.duration = 500
        view.startAnimation(animation)
    }
}