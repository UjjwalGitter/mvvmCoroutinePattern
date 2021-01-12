package com.ujjwalsingh.mvvmcoroutinepattern.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ujjwalsingh.mvvmcoroutinepattern.R


fun ImageView.loadImage(uri: String?) {
    val options = RequestOptions()
        .error(R.mipmap.ic_launcher_round)
    Glide.with(this.context)
        .setDefaultRequestOptions(options)
        .load(uri)
        .into(this)
}