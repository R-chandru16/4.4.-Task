package com.kanini.bookfiltering

import retrofit2.Call
import retrofit2.http.GET

interface HttpApiService {
    @GET("/books")
    suspend fun getBooks(): List<BooksResult>
}