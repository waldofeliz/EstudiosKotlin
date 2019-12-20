package com.android.viewmodelapp.viewmodel

import androidx.lifecycle.ViewModel
import com.android.viewmodelapp.User

class UserViewModel : ViewModel {
    var userList : ArrayList<User>

    constructor(userList: List<User>) : super() {
        this.userList = ArrayList<User>()
    }

    constructor(userList : ArrayList<User>){
        this.userList = userList
    }

    fun addUser(user : User){
        this.userList.add(user)
    }
}