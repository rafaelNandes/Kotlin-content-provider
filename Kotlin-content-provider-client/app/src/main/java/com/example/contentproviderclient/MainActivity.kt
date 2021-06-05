package com.example.contentproviderclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var notesRecycler:RecyclerView
    lateinit var noteRefreshButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notesRecycler = findViewById(R.id.client_list)
        noteRefreshButton = findViewById(R.id.client_button_refresh)
        noteRefreshButton.setOnClickListener {  }
    }
}