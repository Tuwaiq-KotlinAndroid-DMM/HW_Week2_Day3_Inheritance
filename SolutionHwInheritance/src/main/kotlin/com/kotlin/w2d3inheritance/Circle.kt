package com.kotlin.w2d3inheritance

open class Circle(_radius:Double) {
    var radius = _radius
     protected var pi = 3.14


    fun getArea(): Double {

        return (pi*(2*radius))
    }
}



