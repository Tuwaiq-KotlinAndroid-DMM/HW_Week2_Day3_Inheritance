package com.kotlin.hw3week2inheretance

class Cylinder:Circle() {
    var hight = readLine()!!.toDouble()

    fun getVolume(): Double {
        return radius * radius * hight * 3.14
    }

   fun display()  {

       println("The volume of cylinder is ${getVolume()}")
   }
}