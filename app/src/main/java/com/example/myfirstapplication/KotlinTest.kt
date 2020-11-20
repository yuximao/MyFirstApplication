package com.example.myfirstapplication

import java.text.SimpleDateFormat
import java.util.*

class Users {

    var id: Long = 0;
    var name: String = "";//表示不能为空
    var age: Int = 0;
    var name1: String? = null;//添加问号，表示可以为空

    override fun toString(): String {
        return "Users(id=$id, name='$name', age=$age)"
    }
}


fun printDate():String{
    if (android.os.Build.VERSION.SDK_INT >= 24){
        return SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Date())
    }else{
        var tms = Calendar.getInstance()
        return tms.get(Calendar.YEAR).toString() + "-" + tms.get(Calendar.MONTH).toString() + "-" + tms.get(Calendar.DAY_OF_MONTH).toString() + " " + tms.get(Calendar.HOUR_OF_DAY).toString() + ":" + tms.get(Calendar.MINUTE).toString() +":" + tms.get(Calendar.SECOND).toString() +"." + tms.get(Calendar.MILLISECOND).toString()
    }
}

