package com.kotlin.inheritance

fun main () {
    println(" If you want to creat a circle please enter Circle or creat cylinder by entering Cylinder? ")
var User = readLine()!!.toString()
    if (User == "Circle") {
        println("please enter the radius")
        var r = readLine()!!.toDouble()
        var rad = Circle(r).getArea()
        println("Circle Area : $rad")
    }
    else if ( User == "Cylinder" ) {
        println("please enter the radius and the height")
        var cy = readLine()!!.toDouble()
        var cy1 = readLine()!!.toDouble()
       var cy2 = Cylinder(cy,cy1)
        cy2.display()
         }

else {
    println("you need to choose between Circle or Cylinder ")
        }

}