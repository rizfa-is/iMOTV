package com.istekno.imotv_movietvshow.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.data.MovieEntity
import com.istekno.imotv_movietvshow.databinding.ItemsMovieBinding
import com.istekno.imotv_movietvshow.utils.CallbackMovieListener

class MovieAdapter(private val callback: CallbackMovieListener): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovies = ArrayList<MovieEntity>()

    fun setMovies(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

    inner class MovieViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {

                tvMovieTitle.text = movie.title
                tvRating.text = movie.rating.toString()

                shapeableImageView.setOnClickListener {
                    callback.onClickMovie(movie)
                }

                Glide.with(itemView.context)
                    .load(movie.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(shapeableImageView)
            }
        }
    }
}