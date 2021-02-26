package com.istekno.imotv_movietvshow.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragmentViewModel<FragmentBinding : ViewDataBinding, FragmentViewModel : ViewModel> : Fragment() {

    lateinit var binding: FragmentBinding
    lateinit var viewModel: FragmentViewModel
    protected var layout = 0
    protected var vmProvider: FragmentViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layout, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = vmProvider!!
    }
}