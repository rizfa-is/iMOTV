package com.istekno.imotv_movietvshow.ui.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.data.TVShowEntity
import com.istekno.imotv_movietvshow.databinding.ItemsTvShowBinding
import com.istekno.imotv_movietvshow.utils.CallbackShowListener

class TVShowAdapter(private val callback: CallbackShowListener): RecyclerView.Adapter<TVShowAdapter.TVShowViewHolder>() {

    private var listShow = ArrayList<TVShowEntity>()

    fun setShows(shows: List<TVShowEntity>?) {
        if (shows == null) return
        this.listShow.clear()
        this.listShow.addAll(shows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVShowViewHolder {
        val itemsTvShowBinding = ItemsTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TVShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TVShowViewHolder, position: Int) {
        val show = listShow[position]
        holder.bind(show)
    }

    override fun getItemCount(): Int = listShow.size


    inner class TVShowViewHolder(private val binding: ItemsTvShowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(show: TVShowEntity) {
            with(binding) {

                tvShowTitle.text = show.title
                tvRating.text = show.rating.toString()

                shapeableImageView.setOnClickListener {
                    callback.onClickShow(show)
                }

                Glide.with(itemView.context)
                    .load(show.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(shapeableImageView)
            }
        }
    }
}