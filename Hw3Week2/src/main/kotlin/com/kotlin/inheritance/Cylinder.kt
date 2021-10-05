package com.kotlin.inheritance

class Cylinder(radius: Double ,var height: Double):Circle (radius) {
    var cylinder: Double = readLine()!!.toDouble()


    fun getVolume():Double {

        return height* 3.14 *radius*radius
    }

fun display(){

    println(getVolume())

}
}