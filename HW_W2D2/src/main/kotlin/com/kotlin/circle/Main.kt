package com.kotlin.circle

fun main() {
    println("please choose between a Circle or a Cylinder. please type the first letter in capital")

    var userOption = readLine()!!

    if (userOption == "Circle") {

        println("please enter the radius")
       var n = readLine()!!.toDouble()
        var n1 = Circle(n).getArea()
        println("circle area =  $n1 ")

    } else if (userOption == "Cylinder") {
        println("please enter first the radius, then the height ")
        Cylinder().display()}

    else {
        println("please choose between a circle or a cylinder")
    }





}



