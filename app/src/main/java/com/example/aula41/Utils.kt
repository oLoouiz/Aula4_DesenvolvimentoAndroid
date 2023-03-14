package com.example.aula41

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun showMsg(titulo: String, msg: String, ctx: Context){
    AlertDialog.Builder(ctx)
        .setTitle(titulo)
        .setMessage(msg)
        .setPositiveButton("Ok", null)
        .create()
        .show()
}