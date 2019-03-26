package com.example.todo_list

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        floatingActionButton.setOnClickListener {
            val intent = Intent(this, todo_add1::class.java)
            startActivity(intent)
            recyclerView = intent.getStringExtra(todo_add1.EXTRA_TEXTDATA)
        }
    }
}

data class List(val category :String, val todo :String)



