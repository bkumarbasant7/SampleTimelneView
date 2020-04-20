package com.example.sampletimelneview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampletimelneview.timeline.ActivityDetail
import com.example.sampletimelneview.timeline.TimelineAdaptor

class MainActivity : AppCompatActivity() {
    private lateinit var activityTimelineList: ArrayList<ActivityDetail>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityTimelineRv = findViewById<RecyclerView>(R.id.activity_timeline_rv)
        val firstActivity1 =
            ActivityDetail("22-Apr-2020 12:00 AM", "this shipment has been completed1", "Completed")
        val firstActivity2 = ActivityDetail(
            "23-Apr-2020 12:00 AM",
            "this shipment has been completed2",
            "Completed2"
        )
        val firstActivity3 = ActivityDetail(
            "24-Apr-2020 12:00 AM",
            "this shipment has been completed3",
            "Completed3"
        )
        activityTimelineList = ArrayList()
        activityTimelineList.add(firstActivity1)
        activityTimelineList.add(firstActivity2)
        activityTimelineList.add(firstActivity3)
        val adapter = TimelineAdaptor(activityTimelineList)
        activityTimelineRv.adapter = adapter
        activityTimelineRv.layoutManager = LinearLayoutManager(this)
    }
}
