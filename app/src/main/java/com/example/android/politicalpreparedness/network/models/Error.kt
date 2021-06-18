package com.example.android.politicalpreparedness.network.models

data class Error(
    val code: Int,
    val errors: List<ErrorX>,
    val message: String,
    val status: String
)