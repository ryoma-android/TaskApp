package com.example.taskapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var mTaskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val  mTaskAdapter = TaskAdapter(this)

        listView1.setOnItemClickListener { parent, view, position, id ->
        }

        listView1.setOnItemLongClickListener { parent, view, position, id ->

            true
        }

        reloadListView()

    }

    private fun reloadListView() {
        val taskList = mutableListOf("aaa", "bbb", "ccc")

        mTaskAdapter.mTaskList = taskList
        listView1.adapter = mTaskAdapter
        mTaskAdapter.notifyDataSetChanged()
    }
}