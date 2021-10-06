package com.kotlin.hw

class Cylinder(height: Double, radius: Double): Circle(radius) {
    var height:Double=0.0
init {
    this.height=height
}

    fun getVolume():Double
    {
        var area=getArea()
        return (area * height)
    }
}