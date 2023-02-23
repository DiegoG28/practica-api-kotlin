package com.example.api.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Movie(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("adult")
    val adult: Boolean = false,
    @SerializedName("genre_ids")
    val genres: List<Long> = ArrayList(),
    @SerializedName("backdrop_path")
    val backdropPath: String? = "",
    @SerializedName("original_title")
    val originTitle: String? = "",
    @SerializedName("original_language")
    val originalLanguage: String? = "",
    @SerializedName("overview")
    val overview: String? = "",
    @SerializedName("popularity")
    val popularity: Float? = 0f,
    @SerializedName("poster_path")
    val posterPath: String? = "",
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("video")
    val video: Boolean? = false,
    @SerializedName("vote_average")
    val voteAverage: Float? = 0f,
    @SerializedName("vote_count")
    val voteCount: Int? = 0,

) : Parcelable