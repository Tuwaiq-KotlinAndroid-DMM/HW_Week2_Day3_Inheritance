package com.kotlin.w2d3inheritance

class Cylinder (r: Double,_height:Double) :Circle(r){
    var height =_height

    fun getVolume(): Double {

        return (getArea()* height)
    }

    fun display(){

        var volume = getVolume()

        println("The volume is: $volume")
    }
}