package com.kotlin.HW

class Cylinder:Circle() {

  fun getVolume():Double{
      val hight= readLine()!!.toDouble()
      return 2*radius*hight*3.14
  }
fun display(){
    println("the Cylinder Volume is : ${getVolume()}")

}
}

fun main (){
    println("for the circle area enter radius number:")
    var one = readLine()!!.toDouble()
    var x= Circle(one).getarea()
    println("circle area is :$x")

    println("for the Cylinder Volume please enter radius then height : ")
    Cylinder().display()
}