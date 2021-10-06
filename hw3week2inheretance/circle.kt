package com.kotlin.hw3week2inheretance

open class Circle (var radius:Double = readLine()!!.toDouble()){


    fun getArea():Double{
        return radius* radius*3.14
    }
}