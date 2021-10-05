package com.kotlin.HW

open class Circle (var radius:Double= readLine()!!.toDouble()) {

    fun getarea():Double{

        var pi=3.14
        return(pi * radius * radius)
    }
}