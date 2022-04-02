package com.example.week4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week4.model.Idol

class MainVM : ViewModel() {
    private var _listOfData : MutableLiveData<List<Idol>> = MutableLiveData()
    val listOfData : LiveData<List<Idol>>
        get() = _listOfData

    fun loadData(){
        val data = DataStore.getDataSet()
        _listOfData.postValue(data)
    }
}