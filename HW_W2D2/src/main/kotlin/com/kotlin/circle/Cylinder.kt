package com.kotlin.circle

class Cylinder(): Circle() {


   fun getVolume():  Double{
       var height = readLine()!!.toDouble()

     return height*3.14*(radious*2)



   }

    fun display() {
     println("the cylinder surface area: ${getVolume()}")

    }


}