package com.eru.mvp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.eru.mvp1.databinding.ActivityMainBinding
import com.eru.mvp1.presenter.Presenter
import com.eru.mvp1.view.CounterView


class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {

        binding.btnIncrement.setOnClickListener {
            presenter.incrementCount()
        }

//        binding.btnDecrement.setOnClickListener {
//            count--
//            binding.tvCounter.text = count.toString()
//        }
    }

    override fun updateCount(count: Int) {
        binding.tvCounter.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
        binding.tvCounter.setTextColor(color)
    }
}