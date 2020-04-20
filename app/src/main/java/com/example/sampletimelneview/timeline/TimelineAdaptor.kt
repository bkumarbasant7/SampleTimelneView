package com.example.sampletimelneview.timeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.sampletimelneview.R

class TimelineAdaptor(private val activities: List<ActivityDetail>) :
    Adapter<TimelineAdaptor.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var activityDate: TextView = itemView.findViewById(R.id.activity_date_tv)
        var activityMessage: TextView = itemView.findViewById(R.id.activity_message)
        var activityStatus: TextView = itemView.findViewById(R.id.activity_time_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val activityDetailView = inflater.inflate(R.layout.timeline_layout, parent, false)
        return ViewHolder(activityDetailView)
    }

    override fun getItemCount(): Int {
        return activities.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val activityTimeline: ActivityDetail = activities[position]
        val message = holder.activityMessage
        message.text = activityTimeline.message
        val date = holder.activityDate
        date.text = activityTimeline.date
        val status = holder.activityStatus
        status.text = activityTimeline.status
    }

}