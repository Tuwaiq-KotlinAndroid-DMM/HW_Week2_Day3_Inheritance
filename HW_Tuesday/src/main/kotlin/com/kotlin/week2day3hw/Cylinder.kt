package com.kotlin.week2day3hw

class Cylinder(x :Double, h:Double):Circle(x) {
    var height: Double = h

    fun getVolume () : Double{
      return  pi * radius * radius * height
//      return  getArea() * height

    }
    fun display(x :Double){

        println(x)
    }


}

