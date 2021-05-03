package com.d3if2070.galerihewan.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.d3if2070.galerihewan.model.Hewan
import com.d3if2070.galerihewan.network.ApiStatus
import com.d3if2070.galerihewan.network.HewanApi
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Hewan>>()
    private val status = MutableLiveData<ApiStatus>()

    init {

        retrieveData()
    }

    private fun retrieveData() {
        status.value = ApiStatus.LOADING
        viewModelScope.launch {
            try {
                data.value = HewanApi.service.getHewan()
                status.value = ApiStatus.SUCCESS
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure :${e.message}")
                status.value = ApiStatus.FAILED
            }
        }
    }
    fun getData() : LiveData<List<Hewan>> = data

    fun getStatus(): LiveData<ApiStatus> = status
}