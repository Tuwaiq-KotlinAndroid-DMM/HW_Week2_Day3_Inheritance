package com.kotlin.Inheritance

open class Cylinder(var height:Double, radius: Double) :Circle(radius) {

    override fun getArea(): Double {
        return Math.PI*radius*radius


    }
     open fun getVolume():Double{

        return Math.PI*radius*radius*height
    }
    open fun display(): String {

        return "The area is: ${getArea() } \n The Volume is: ${getVolume() } "
    }

}