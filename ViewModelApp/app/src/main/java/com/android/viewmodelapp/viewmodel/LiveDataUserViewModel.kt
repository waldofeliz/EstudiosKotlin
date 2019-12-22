package com.android.viewmodelapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.viewmodelapp.User

class LiveDataUserViewModel : ViewModel() {
    var userListLiveData : MutableLiveData<ArrayList<User>> = MutableLiveData()

    var userList = ArrayList<User>()

    fun getUserList() : LiveData<ArrayList<User>>{
        if (userListLiveData == null){
            userListLiveData = MutableLiveData<ArrayList<User>>()
            userList = ArrayList<User>()
        }
        return userListLiveData
    }

    fun addUser(user: User){
        userList.add(user)
        userListLiveData.value = userList
    }

}