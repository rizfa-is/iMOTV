package com.istekno.imotv_movietvshow.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseActivityViewModel<ActivityBinding: ViewDataBinding, ActivityViewModel: ViewModel>: AppCompatActivity() {

    lateinit var binding: ActivityBinding
    lateinit var viewModel: ActivityViewModel
    protected var layout = 0
    protected var vmProvider: ActivityViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layout)
        viewModel = vmProvider!!
    }
}