package com.lek.mygoals.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.lek.mygoals.R

class MainActivity : AppCompatActivity() {

    // TODO Display list of goals
        // Hint
        // Create a list adapter(preferably recycler view)
        // use the list adapter to display goals
        // Add a cache mechanism to save goals on disk
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<FloatingActionButton>(R.id.addGoalButton).setOnClickListener {
            startActivity(Intent(this, AddGoalActivity::class.java))
        }
    }
}

// Add goal
// Display the list of goals that we added

// Service to provide goals
// Repository to manage goal data storage
