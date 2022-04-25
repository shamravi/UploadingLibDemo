package com.demo.toastlib

import android.content.Context
import android.widget.Toast

object SampleToast {

    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}