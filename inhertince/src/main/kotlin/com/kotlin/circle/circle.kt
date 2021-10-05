//Part I: Practice with inheritance

//Q1

package com.kotlin.circle

open class circle(radias: Double) {

    var radias = readLine()!!.toDouble()

    fun getArea(): Double {
        var pi = 3.14

        return (pi * radias * radias)
    }
}

//Q2

open class cylinder(radias: Double) :circle(radias) {

    fun getVolume(): Double {
        var hight = readLine()!!.toDouble()
        return 2 * hight * radias * 3.14

    }

    fun display() {
        println("The cylinder volume = ${getVolume()}")
    }


}

fun main() {
    println("Enter radius number")
    var C = readLine()!!.toDouble()
    var C1 = circle(C).getArea()
    println("the circle area = $C1")


    println("Enter the radias number then enter the high :")
    cylinder(12.0).display()


}



