package com.kotlin.inheritance

class Cylinder(radius: Double, var height: Double) : Circle(radius) {
    fun getVolume(): Double {
        var area = getArea() // Not sure
        return area * height
    }

    fun display() {
        println("The cylinder surface is ${"%.2f".format(2 * pi * height * radius)}, and its volume is ${"%.2f".format(getVolume())}.")
    }
}