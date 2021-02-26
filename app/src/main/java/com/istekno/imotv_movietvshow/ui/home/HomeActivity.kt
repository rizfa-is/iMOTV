package com.istekno.imotv_movietvshow.ui.home

import android.os.Bundle
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.databinding.ActivityHomeBinding
import com.istekno.imotv_movietvshow.ui.base.BaseActivity

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        layout = R.layout.activity_home
        super.onCreate(savedInstanceState)

        val pagerAdapter = HomePagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = pagerAdapter
        binding.tabs.setupWithViewPager(binding.viewPager)
    }
}