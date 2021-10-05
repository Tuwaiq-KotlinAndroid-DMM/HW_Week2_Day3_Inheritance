package com.kotlin.circle

import kotlin.math.PI

open class Circle(radius :Double) {
    var r = radius
    fun getArea(){ println(PI*r*r)}

    fun displayc(){"The area of the circle = ${getArea()}"}
}