package com.example.sampletimelneview.timeline

class ActivityDetail(val date: String, val message: String, val status: String) {
    override fun toString(): String {
        return message + "on" + date
    }
}
