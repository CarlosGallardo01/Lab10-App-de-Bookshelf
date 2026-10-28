package com.example.bookshelf.network

import kotlinx.serialization.Serializable

@Serializable
data class BookQueryResponse(
    val items: List<BookItem>? = null
)

@Serializable
data class BookItem(
    val id: String,
    val volumeInfo: VolumeInfo
)

@Serializable
data class VolumeInfo(
    val title: String,
    val imageLinks: ImageLinks? = null
)

@Serializable
data class ImageLinks(
    val thumbnail: String
) {
    // Android bloquea tráfico HTTP sin encriptar, forzamos HTTPS
    val httpsThumbnail: String
        get() = thumbnail.replace("http:", "https:")
}