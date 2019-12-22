package com.android.viewmodelapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.android.viewmodelapp.R
import com.android.viewmodelapp.User
import com.android.viewmodelapp.viewmodel.LiveDataUserViewModel

class LiveDataActivity : AppCompatActivity() {

    private var numero : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        configView()
    }

    fun configView(){
        var liveDataUserViewModel = ViewModelProviders.of(this)[LiveDataUserViewModel::class.java]
        var tvLiveData :TextView = findViewById(R.id.liveDataTv)
        var btSalvar :Button = findViewById(R.id.liveDataBtSalvar)

        btSalvar.setOnClickListener{view ->
            if(numero == 0){
                var user: User = User("Alberto","30")
                liveDataUserViewModel.addUser(user)

            }
            if(numero == 1){
                var user: User = User("Maria","30")
                liveDataUserViewModel.addUser(user)

            }
            if(numero == 2){
                var user: User = User("Manuel","40")
                liveDataUserViewModel.addUser(user)

            }
            numero++
        }

        var listObserver : Observer<ArrayList<User>> = Observer{userList ->
            var texto : String = ""
            for(x in userList){
                texto += x.nombre + " " + x.edad + "\n"
            }
            tvLiveData.text = texto
        }

        liveDataUserViewModel.getUserList().observe(this,listObserver)
    }
}
