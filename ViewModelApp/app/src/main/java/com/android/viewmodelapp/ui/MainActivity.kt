package com.android.viewmodelapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.viewmodelapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var btViewModelActivitySumar :Button
    lateinit var btViewModelActivityUser :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btViewModelActivitySumar = findViewById(R.id.viewModelActivityBtSumar)
        btViewModelActivityUser = findViewById(R.id.viewModelActivityBtUser)

        btViewModelActivitySumar.setOnClickListener{view ->
            val intent = Intent(this, ViewModelActivity::class.java)
            startActivity(intent)
        }

        btViewModelActivityUser.setOnClickListener{view ->
            val intent = Intent(this, ViewModelUserActivity::class.java)
            startActivity(intent)
        }
    }
}
