package com.kotlin.inheritance

fun main() {
    println("Choose a shape to create:\n1. Circle\t\t2. Cylinder")
    var shapeChoice = readLine()
    when (shapeChoice) {
        "1" -> {
            println("Please enter the circle radius:")
            var cRadius = readLine()!!.toDouble()
            var circle = Circle(cRadius)
            println("The circle area is: ${circle.getArea()}")
        }
        "2" -> {
            println("Please enter the cylinder radius:")
            var cRadius = readLine()!!.toDouble()
            println("Please enter the cylinder height:")
            var cHeight = readLine()!!.toDouble()
            var cylinder = Cylinder(cRadius, cHeight)
            cylinder.display()
        }
        else -> println("Invalid input: Please choose either 1 or 2")
    }

}