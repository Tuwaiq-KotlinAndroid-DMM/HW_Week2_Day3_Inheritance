package com.kotlin.shapes

import kotlin.math.PI

open class Circle(var radius: Double = 0.0) {
    fun getArea(): Double {
        return PI * radius * radius
    }

    open fun display() {
        println("The area of the circle = ${"%.2f".format(getArea())}")

    }
}