package com.kotlin.inheritance

open class Circle(protected var radius: Double) {
    val pi = 3.14

    private fun getArea(): Double {
        return pi * radius * radius
    }

    open fun display() {
        println("The circle's area is ${getArea()}")
    }
}