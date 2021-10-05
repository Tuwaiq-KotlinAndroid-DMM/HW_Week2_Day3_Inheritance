package com.kotlin.Inheritance

open class Circle(var radius:Double) {

    open fun getArea():Double{
        return Math.PI*radius*radius
    }

}