package com.kotlin.part1

open class Circle {
    var radius:Double=0.00



    open fun getArea(pi:Double,rad:Double):Double{
        var area= pi * rad * rad
        return area
    }
}