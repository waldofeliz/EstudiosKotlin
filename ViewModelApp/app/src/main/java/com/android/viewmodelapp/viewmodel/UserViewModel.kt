package com.android.viewmodelapp.viewmodel

import androidx.lifecycle.ViewModel
import com.android.viewmodelapp.User

class UserViewModel : ViewModel() {

    var userList = ArrayList<User>()



    fun addUser(user : User){
        this.userList.add(user)
    }
}