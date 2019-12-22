package com.android.viewmodelapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.android.viewmodelapp.R
import com.android.viewmodelapp.User
import com.android.viewmodelapp.viewmodel.UserViewModel

class ViewModelUserActivity : AppCompatActivity() {

    private lateinit var etNombre :EditText
    private lateinit var etEdad :EditText
    private lateinit var btSalvar : Button
    private lateinit var btVerUser :Button
    private lateinit var tvUser : TextView
    private lateinit var tvUserViewModel : TextView

    private lateinit var userList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_user)
        configView()
    }
    fun configView(){
        var userViewModel = ViewModelProviders.of(this)[UserViewModel::class.java]
        userList = ArrayList<User>()

        tvUser = findViewById(R.id.userActivityTvUser)
        tvUserViewModel = findViewById(R.id.userActivityTvUserViewModel)

        etNombre = findViewById(R.id.userActivityEtNombre)
        etEdad = findViewById(R.id.userActivityEtEdad)

        btSalvar = findViewById(R.id.userActivityBtSalvar)
        btVerUser = findViewById(R.id.userActivityBtVer)

        btSalvar.setOnClickListener{view ->
            var user: User = User(etNombre.text.toString(), etEdad.text.toString())
            userList.add(user)
            userViewModel.addUser(user)
        }

        btVerUser.setOnClickListener{view->
            var texto : String = ""
            for(x in userList){
                texto += x.nombre + " " + x.edad + "\n"
            }

            tvUser.text = texto

            texto = ""

            for(x in userViewModel.userList){
                texto += x.nombre + " " + x.edad + "\n"
            }

            tvUserViewModel.text = texto
        }
    }
}
