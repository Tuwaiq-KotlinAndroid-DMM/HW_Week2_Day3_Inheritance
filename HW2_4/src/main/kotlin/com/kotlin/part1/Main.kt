package com.kotlin.part1
fun main() {

    val pie =3.14
    println("Chose either circle or cylinder: ")
    var input = readLine()


    if(input =="circle"){
        var cir = Circle()
        println("Enter the radius:")
        cir.radius= readLine()!!.toDouble()

        println("the area of your circle is ${cir.getArea(pie,cir.radius)}")


    }else if (input == "cylinder"){
        var cyl=Cylinder()

        println("Enter the radius:")
        cyl.radius= readLine()!!.toDouble()

        println("Enter the height:")
        cyl.cyHeight= readLine()!!.toDouble()

        cyl.display()


    }


}