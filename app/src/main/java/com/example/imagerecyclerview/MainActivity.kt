package com.example.imagerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var imgRecycler : RecyclerView
    private var imgList = ArrayList<Int>()

    private lateinit var imageAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initview()
        initData()
    }

    private fun initview(){
        imgRecycler= findViewById(R.id.imgRecycler)

        imgRecycler.layoutManager = GridLayoutManager(this@MainActivity,2)
        imageAdapter = ImageAdapter(imgList)
        imgRecycler.adapter = imageAdapter

        val setOnClickImageListener  = SetOnClickImageListener()
        imageAdapter.setOnImageClickListener(setOnClickImageListener)
    }

    private fun initData(){

        imgList.add(R.drawable.img10)
        imgList.add(R.drawable.img9)
        imgList.add(R.drawable.img8)
        imgList.add(R.drawable.img7)
        imgList.add(R.drawable.img6)
        imgList.add(R.drawable.img5)
        imgList.add(R.drawable.img4)
        imgList.add(R.drawable.img1)
        imgList.add(R.drawable.img2)
        imgList.add(R.drawable.img3)
        imgList.add(R.drawable.img4)
        imgList.add(R.drawable.img3)
        imgList.add(R.drawable.img10)
        imgList.add(R.drawable.img9)
        imgList.add(R.drawable.img8)
        imgList.add(R.drawable.img7)
        imgList.add(R.drawable.img6)
        imgList.add(R.drawable.img5)
        imgList.add(R.drawable.img9)
        imgList.add(R.drawable.img1)
        imgList.add(R.drawable.img2)
        imgList.add(R.drawable.img3)
        imgList.add(R.drawable.img8)
        imgList.add(R.drawable.img3)
        imgList.add(R.drawable.img4)
        imgList.add(R.drawable.img4)
    }
    
    inner  class SetOnClickImageListener : ImageAdapter.OnClickImageListener{
          override fun onclick(position: Int, imgId: Int) {
              Toast.makeText(this@MainActivity ,"position : $position , imgId : $imgId" , Toast.LENGTH_SHORT).show()
          }

      }
}