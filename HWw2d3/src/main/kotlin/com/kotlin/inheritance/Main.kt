package com.kotlin.inheritance

fun main() {
    var shape = 2

    while (shape != 0 && shape != 1) {
        println(
            "This program to create either a circle or cylinder \n" +
                    "Please Enter 0 to create a circle,or Enter 1 to create a cylinder"
        )
        shape = try {
            (readLine() ?: "").toInt()
        } catch (e: NumberFormatException) {
            2
        }
    }

    if (shape == 0) {
        println("Please Enter radius number")
        var radius = (readLine() ?: "").toDouble()
        val circle = Circle(radius)
        println(circle.display())

    } else if (shape == 1) {
        println("Please Enter radius number")
        var radius = (readLine() ?: "").toDouble()

        println("Please Enter height number")
        var height = (readLine() ?: "").toDouble()

        val cylinder = Cylinder(height, radius)
        println(cylinder.display())
    }
}