package com.istekno.imotv_movietvshow.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.istekno.imotv_movietvshow.ui.movie.MovieFragment
import com.istekno.imotv_movietvshow.ui.tvshow.TVShowFragment

class HomePagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTitles = arrayOf("Movie", "TV Show")
    private val fragment = arrayOf(MovieFragment(), TVShowFragment())

    override fun getCount(): Int = tabTitles.size

    override fun getItem(position: Int): Fragment = fragment[position]

    override fun getPageTitle(position: Int): CharSequence = tabTitles[position]
}