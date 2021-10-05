package com.kotlin.inheritance

// Part 1 - Practice with inheritance
open class Circle(var radius: Double) {
    var pi = 3.14
    fun getArea(): Double {
        return pi * radius * radius
    }
}