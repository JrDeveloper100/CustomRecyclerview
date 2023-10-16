package com.example.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecyclermodule.CustomAdapter
import com.example.customrecyclermodule.Item

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            Item("Item 1", R.drawable.image1),
            Item("Item 2", R.drawable.image1),
            Item("Item 3", R.drawable.image1),
            Item("Item 1", R.drawable.image1),
            Item("Item 2", R.drawable.image1),
            Item("Item 1", R.drawable.image1),
            Item("Item 2", R.drawable.image1),
            Item("Item 1", R.drawable.image1),
            Item("Item 2", R.drawable.image1),
            Item("Item 1", R.drawable.image1),
            Item("Item 2", R.drawable.image1),
        )  // Replace with your data and appropriate image resource references

        val adapter = CustomAdapter(items)
        recyclerView.adapter = adapter

    }
}