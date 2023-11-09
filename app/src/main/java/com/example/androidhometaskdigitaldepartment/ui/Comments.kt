package com.example.androidhometaskdigitaldepartment.ui

import com.example.androidhometaskdigitaldepartment.R

data class Comment(
    val username: String,
    val imageRes: Int,
    val date: String,
    val text: String,
)
val commentList = listOf(
    Comment(
        text = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        date = "February 14, 2019",
        username = "Auguste Conte",
        imageRes = R.drawable.img_man1
    ),
    Comment(
        text = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        date = "February 14, 2019",
        username = "Jang Marcelino",
        imageRes = R.drawable.img_man2
    ),
)