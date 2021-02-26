package com.istekno.imotv_movietvshow.ui.tvshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.data.TVShowEntity
import com.istekno.imotv_movietvshow.databinding.FragmentTvShowBinding
import com.istekno.imotv_movietvshow.ui.base.BaseFragmentViewModel
import com.istekno.imotv_movietvshow.ui.detail.tvshow.DetailTvShowActivity
import com.istekno.imotv_movietvshow.utils.CallbackShowListener

class TVShowFragment : BaseFragmentViewModel<FragmentTvShowBinding, TVShowViewModel>(), CallbackShowListener {

    companion object {
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layout = R.layout.fragment_tv_show
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        vmProvider = ViewModelProvider(this).get(TVShowViewModel::class.java)
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val shows = viewModel.getTVShows()
            val tvShowAdapter = TVShowAdapter(this)

            tvShowAdapter.setShows(shows)

            with(binding.rvTvShow) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }

    override fun onClickShow(tvShowEntity: TVShowEntity) {
        val sendIntent = Intent(context, DetailTvShowActivity::class.java)
        sendIntent.putExtra(EXTRA_TV_SHOW, tvShowEntity.tvsId)
        startActivity(sendIntent)
    }
}