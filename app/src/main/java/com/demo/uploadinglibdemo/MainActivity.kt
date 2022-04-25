package com.demo.uploadinglibdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.toastlib.SampleToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SampleToast.show(this, "test")
    }
}