package com.kotlin.shapes

import kotlin.math.PI

class Cylinder(
    radius: Double,
    var height: Double = 0.0
) : Circle(radius) {


    fun getVolume(): Double {
        return PI * radius * radius * height
    }

    fun getSuraceArea(): Double {
        return 2 * PI * radius * (height + radius)
    }

    override fun display() {
        println("Cylinder surface area = ${"%.2f".format(getSuraceArea())} ")
        println("Cylinder volume = ${"%.2f".format(getVolume())}")
    }


}