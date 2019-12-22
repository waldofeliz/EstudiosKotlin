package com.android.viewmodelapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.viewmodelapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var btViewModelActivitySumar :Button
    private lateinit var btViewModelActivityUser :Button
    private lateinit var btViewModelActivityLiveData : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btViewModelActivitySumar = findViewById(R.id.viewModelActivityBtSumar)
        btViewModelActivityUser = findViewById(R.id.viewModelActivityBtUser)
        btViewModelActivityLiveData = findViewById(R.id.viewModelActivityBtLiveData)

        btViewModelActivitySumar.setOnClickListener{view ->
            val intent = Intent(this, ViewModelActivity::class.java)
            startActivity(intent)
        }

        btViewModelActivityUser.setOnClickListener{view ->
            val intent = Intent(this, ViewModelUserActivity::class.java)
            startActivity(intent)
        }

        btViewModelActivityLiveData.setOnClickListener{view ->
            val intent = Intent(this, LiveDataActivity::class.java)
            startActivity(intent)
        }
    }
}
