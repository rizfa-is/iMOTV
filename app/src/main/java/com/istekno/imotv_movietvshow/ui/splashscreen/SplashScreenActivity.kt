package com.istekno.imotv_movietvshow.ui.splashscreen

import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.databinding.ActivitySplashScreenBinding
import com.istekno.imotv_movietvshow.ui.base.BaseActivity
import com.istekno.imotv_movietvshow.ui.home.HomeActivity

class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        layout = R.layout.activity_splash_screen
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
        )

        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION
        )

        Handler(mainLooper).postDelayed(
            {
                intent<HomeActivity>(this)
                finishAffinity()
            }, 1000
        )
    }
}