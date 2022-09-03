package com.rich.topic3fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.rich.topic3fragment.databinding.ActivityMainBinding

//import com.rich.topic3fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapater
    private lateinit var viewPager : ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapater(supportFragmentManager,lifecycle)
        val viewPager = binding.viewPager
        viewPager.adapter = viewPagerAdapter

        TabLayoutMediator(binding.tabLayout,viewPager){tab, position ->
            when(position){
                0 -> tab.text = "Tab 1"
                1 -> tab.text = "Tab 2"
            }
        }.attach()

//        setContentView(R.layout.activity_main)
//        viewPager = findViewById(R.id.view_pager)
//        tabLayout = findViewById(R.id.tab_layout)
//        viewPagerAdapter = ViewPagerAdapater(supportFragmentManager,lifecycle)
//        viewPager.adapter = viewPagerAdapter
//
//        TabLayoutMediator(tabLayout,viewPager){tab, position ->
//            when(position){
//                0 -> tab.text = "Tab 1"
//                1 -> tab.text = "Tab 2"
//            }
//        }.attach()
    }
}