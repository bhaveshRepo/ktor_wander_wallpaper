package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Wallpaper(
    val name: String,
    val description: String,
    val imageUrl: String
)
