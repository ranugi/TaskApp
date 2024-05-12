package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var taskViewModel: TaskViewModel // Declare taskViewModel variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel =
            ViewModelProvider(this).get(TaskViewModel::class.java) //initialized taskViewModel
        binding.newTaskButton.setOnClickListener {
            NewTaskSheet(null).show(supportFragmentManager, "newTaskTag")
        }

//        taskViewModel.name.observe(this) {
//            binding.taskName.text = String.format("Task Name: %s", it)
//        }
//        taskViewModel.desc.observe(this) {
//            binding.taskDesc.text = String.format("Task Description: %s", it)
//        }
    }
}