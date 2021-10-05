package com.kotlin.hw

open class Circle(_radius:Double) {
    var radius = _radius
    protected var pi = 3.14


    fun getArea(): Double {

        return (pi*(2*radius))
    }
}


class Cylinder(r: Double,h:Double) :Circle(r){
    var height =h

    fun getVolume(): Double {

        return (getArea()* height)
    }

    fun display(){

        var volume = getVolume()

        println("The volume is: $volume")
    }
}