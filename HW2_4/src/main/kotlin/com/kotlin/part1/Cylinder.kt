package com.kotlin.part1

import java.awt.geom.Area

class Cylinder:Circle() {
    var cyHeight:Double = 0.00


    override fun getArea(pi: Double, rad: Double): Double {
        var area= pi * rad * rad
        return area


    }
    fun getVolume(area:Double,height:Double):Double{
        return area * height

    }

    fun display(){
        println("The surface area of your cylinder is ${getArea(3.14,radius)} " +
                "and the and the volume is ${getVolume(getArea(3.14,radius),3.14)} ")
    }


}