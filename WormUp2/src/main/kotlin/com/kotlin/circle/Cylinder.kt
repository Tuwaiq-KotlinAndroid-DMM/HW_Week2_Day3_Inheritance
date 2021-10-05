package com.kotlin.circle

import kotlin.math.PI

class Cylinder(r : Double, height : Double) : Circle(r) {
    var h = height
    fun getVolume(){ println(PI * r * r * h) }
    fun getSurface(){ println(2*PI*r*h+2*PI*r*r)}

    fun displayv(){"The volume of the cylinder = ${getVolume()}"}
    fun displaya(){"The surface area of the cylinder = ${getSurface()}"}

}