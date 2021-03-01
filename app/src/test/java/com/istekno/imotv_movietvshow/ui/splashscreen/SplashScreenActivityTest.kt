package com.istekno.imotv_movietvshow.ui.splashscreen

import android.widget.ImageView
import com.istekno.imotv_movietvshow.BuildConfig
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.ui.home.HomeActivity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, packageName = "com.istekno.imotv_movietvshow.ui.splashscreen")
class SplashScreenActivityTest {

    private lateinit var splashActivity: SplashScreenActivity

    @Before
    fun init() {
        splashActivity = Robolectric.buildActivity(SplashScreenActivity::class.java).create().resume().get()
    }

    @Test
    fun splashActivity_showOrNot() {
        assertNotNull(splashActivity)
    }

    @Test
    fun splashImage_showOrNot() {
        val imageView = splashActivity.findViewById<ImageView>(R.id.img_splash)
        val srcImage = imageView.drawable

        assertEquals(srcImage, R.drawable.img_imotv)
    }
}