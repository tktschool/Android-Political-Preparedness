package com.example.android.politicalpreparedness.network.jsonadapter

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.text.SimpleDateFormat
import java.util.*

class customDateAdapter {
    private val formatDate = SimpleDateFormat("yyyy-MM-dd", Locale.US)

    @FromJson
    fun dateFromString(date: String): Date = formatDate.parse(date)!!

    @ToJson
    fun dateToString(date: Date): String = formatDate.format(date)
}