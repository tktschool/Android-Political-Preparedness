package com.example.android.politicalpreparedness.utils

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.android.politicalpreparedness.network.models.Election
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("electionDateText")
fun TextView.setElectionDate(item: Election) {
    item.let {
        text = item.electionDay.toFormatDateString()
    }
}

fun Date.toFormatDateString(): String {
    val format = SimpleDateFormat("EEE dd MMM yyyy", Locale.US)
    return format.format(this)
}