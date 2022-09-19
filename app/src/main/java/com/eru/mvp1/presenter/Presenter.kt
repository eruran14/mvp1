package com.eru.mvp1.presenter

import com.eru.mvp1.model.CounterModel
import com.eru.mvp1.view.CounterView

class Presenter {

    private val model = CounterModel()
    private lateinit var view: CounterView

    fun incrementCount(){
        model.increment()
        view.updateCount(model.getCount())
        if (model.getCount() == 10){
            view.showToast()
        }

        if (model.getCount() == 15){
            view.changeTextColor(model.color)
        }
    }

    fun attachView(view: CounterView){
        this.view = view
    }
}