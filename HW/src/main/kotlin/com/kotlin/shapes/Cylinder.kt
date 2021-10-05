package com.kotlin.shapes

class Cylinder(_height: Double, r: Double) : Circle(r) {
    var height = _height

    fun getVolume(): Double {
        var volume = getArea() * height
        return volume
    }

    fun getSurfaceArea(): Double {
        var sufraceArea = getArea() * 2
        return sufraceArea
    }

    fun display() {
        var CVolume = getVolume()
        var Csurface = getSurfaceArea()
        println("The volume of a Clynder is $CVolume and the surface area is $Csurface")

    }
}