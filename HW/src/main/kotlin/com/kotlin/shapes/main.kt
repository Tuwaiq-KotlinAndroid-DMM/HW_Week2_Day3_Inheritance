package com.kotlin.shapes

fun main() {


    println("Choose either a circle or a cyliner to calculate:")
    var input = readLine()!!
    if (input == "circle") {
        println("Enter the number of radius:")
        var rad = readLine()!!.toDouble()
        var area = Circle(rad).getArea()

        println("the Area of a circle is $area")

    } else if (input == "cylinder") {
        println("Enter the number of radius")
        var rad = readLine()!!.toDouble()
        println("Enter the number of height")
        var height = readLine()!!.toDouble()
        var CylVol = Cylinder(height, rad)
        CylVol.display()


    }
}
