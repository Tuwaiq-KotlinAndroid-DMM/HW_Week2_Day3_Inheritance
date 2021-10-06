package com.kotlin.hw3week2inheretance

fun main(){

    println("To create a circle press 1 or to create a cylinder press 2")

    var user = readLine()!!.toInt()

    if (user == 1){
        println("Circle\nType the radius number:")

        var i = readLine()!!.toDouble()
        var x = Circle(i).getArea()

        println("The area of the circle  is $x")
    }
    else if (user == 2){
        println("Cylinder\nType the highest and then the radius number")
        Cylinder().display()
    }
    else {
        println("Please select a number from 1 or 2 only ")
    }
}

