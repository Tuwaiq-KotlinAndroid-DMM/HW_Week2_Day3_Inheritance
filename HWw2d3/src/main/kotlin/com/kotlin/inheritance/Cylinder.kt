package com.kotlin.inheritance

class Cylinder(private var hight: Double, radius: Double) : Circle(radius) {

    private fun getVolume(): Double {
        return pi * radius * radius * hight
    }

    override fun display() {

        println(
            "The cylinder's Surface area is ${getSurfaceArea()} " +
                    "The cylinder's Volume is ${getVolume()}"
        )
    }

    private fun getSurfaceArea(): Double {
        return 2 * pi * radius * (hight + radius)
    }
}