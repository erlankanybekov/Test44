package com.example.test44

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test44.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            calculate.setOnClickListener {
                txtRes.text = Math().add(firstNum.text.toString(),secondNum.text.toString())
            }
        }
    }
}