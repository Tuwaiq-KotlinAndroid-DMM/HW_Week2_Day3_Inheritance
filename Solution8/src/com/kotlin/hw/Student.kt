package com.kotlin.hw

import java.math.BigDecimal
import java.math.RoundingMode

class Student: Person() {
    private  var major:String
    private  var gpa:Double


    init {
        major=" "
        gpa=0.0


    }
 override fun inputPerson(name:String,id:Int,em:String)
  {
      super.inputPerson(name, id, em)
      println("Enter your major and gpa")
      var major= readLine()!!
      var gpa= readLine()!!.toDouble()
      this.major=major
      this.gpa=gpa
  }
   override  fun printPerson():String
   {
       println(super.printPerson())
       return("Major: "+this.major+" GPA: "+BigDecimal(gpa).setScale(2, RoundingMode.HALF_EVEN))
   }
}