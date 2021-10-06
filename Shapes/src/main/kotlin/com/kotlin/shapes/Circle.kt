package com.kotlin.shapes

open class Circle (radius = Double) {

    var r : Double = radius
    var pi : Double = 3.14


    fun getArea (): Double{

        var area = pi * r *r

        return area

}}