package com.demo.toastlib

import android.content.Context
import android.widget.Toast

public class SampleToast(private val context: Context) {

    fun show(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}