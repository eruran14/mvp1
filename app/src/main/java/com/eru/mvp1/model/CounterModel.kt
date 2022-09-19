package com.eru.mvp1.model

import com.eru.mvp1.R


class CounterModel {

    private var count = 0
    val color = R.color.green

    fun increment(){
        count++
    }

    fun getCount(): Int{
        return count
    }
}