package com.kotlin.Inheritance

fun main() {
    println("Enter 1 for Cylinder and 2 for Circle  ")
    var input = readLine()!!.toInt()

        if (input == 1) {
            println("Enter radius value:")
            var theR = readLine()!!.toDouble()
            println("Enter hight value:")
            var theH = readLine()!!.toDouble()
            var myCylinder = Cylinder(theH, theR)
            myCylinder.getVolume()
            println(myCylinder.display())
        } else if (input == 2) {

            println("Enter radius value:")
            var theR = readLine()!!.toDouble()
            var myCircle = Circle(theR)
            println("The area is :${myCircle.getArea()}")

        } else {

            println("invalid input")



        }






}
//println("Enter 1 for Cylinder ")
//
//        println("Enter radius value:")
//        var theR = readLine()!!.toDouble()
//        println("Enter hight value:")
//        var theH = readLine()!!.toDouble()
//        var myCylinder = Cylinder(theR, theH)
//        myCylinder.display()
//    } else if (input == 2) {
//        println("Enter radius value:")
//        var theR = readLine()!!.toDouble()
//        var myCircle = Circle(theR)
//        myCircle
//
//    }