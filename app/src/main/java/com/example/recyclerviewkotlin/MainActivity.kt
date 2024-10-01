package com.example.recyclerviewkotlin

import android.annotation.SuppressLint
import android.os.Binder
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var dataList: ArrayList<RvModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        dataList = ArrayList<RvModel>() // insalize

        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.rat,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.rat,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.man1,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.man2,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.man3,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.man4,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))
        dataList.add(RvModel(R.drawable.per,"Taj Hotal","Mumbai"))


        rvAdapter = RvAdapter(dataList,this)
        binding.rv.layoutManager = LinearLayoutManager(this) // LinearLayout.HORIZONTAL,false -> Horizontally scroll
        binding.rv.adapter = rvAdapter

        // convert into grid layout
//        binding.rv.layoutManager = GridLayoutManager(this,2)

        // staged layout
//        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL)

    }
}