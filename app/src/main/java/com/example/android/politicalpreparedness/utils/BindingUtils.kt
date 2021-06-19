package com.example.android.politicalpreparedness.utils

import android.view.View
import android.widget.Button
import android.widget.ImageView
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

@BindingAdapter("setVisibilityBinding")
fun setVisibility(view: View, isVisible: Boolean) {
    view.visibility = if (isVisible) View.VISIBLE else View.GONE
}

@BindingAdapter("viewVisibility")
fun TextView.bindVisible(status: String?) {
    visibility = if (status.isNullOrEmpty()) View.GONE else View.VISIBLE
}

@BindingAdapter("buttonVisibility")
fun Button.bindVisible(status: String?) {
    visibility = if (status.isNullOrEmpty()) View.GONE else View.VISIBLE
}