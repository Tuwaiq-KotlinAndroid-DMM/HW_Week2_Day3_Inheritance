package com.kotlin.shapes

class Cylinder(h: Double , r: Double) : Circle() {

    var height = h

    fun getVolume() {
        var volume = pi + r * r * height
        return volume

    }

    fun surfaceArea (){
        var surfaceArea = getArea() *2
        return surfaceArea

    }

    fun display(){
        var CylinderVolume = getVolume()
        var CylinderSurface = surfaceArea()
        println("The Cylinder's volume is $CylinderVolume and the Cylinder's surface is $CylinderSurface")


    }
}