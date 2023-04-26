package com.example.imagerecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val imgList : ArrayList<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {


    interface OnClickImageListener{
        fun onclick(position: Int , imgId : Int)
    }

    var onClickImageListener : OnClickImageListener? = null


    fun setOnImageClickListener(onClickImageListener: OnClickImageListener){
        this.onClickImageListener = onClickImageListener
    }

    inner class ImageViewHolder(view : View) : RecyclerView.ViewHolder(view){
        lateinit var imgId : ImageView

        init {
            imgId = view.findViewById(R.id.imgId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder( LayoutInflater.from(parent.context)
             .inflate(R.layout.image_view_item,null))

    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imgId.setImageResource(imgList[position])
        holder.imgId.setOnClickListener{
            onClickImageListener?.onclick(position,imgList[position])
        }
    }

    override fun getItemCount() = imgList.size


}