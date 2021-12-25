package com.example.rssfeedpractice

data class Feed(val title: String, val author: Author)

data class Author(val name: String, val url: String)