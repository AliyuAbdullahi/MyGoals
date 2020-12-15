package com.lek.mygoals.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.lek.mygoals.R

class AddGoalActivity : AppCompatActivity() {

    // TODO Finish this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_goal)

        findViewById<FloatingActionButton>(R.id.createGoalButton).setOnClickListener {
            finish()
        }
    }
}
