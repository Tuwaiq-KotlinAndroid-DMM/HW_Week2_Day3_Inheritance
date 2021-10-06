package com.kotlin.shapes

open class Circle (radius: Double) {
    var r: Double = radius
    private var pi: Double = 3.14


    open fun getArea(): Double {

        var area = pi * r * r

        return area
    }
}