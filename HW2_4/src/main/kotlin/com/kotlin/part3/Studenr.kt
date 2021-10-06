package com.kotlin.part3

class Student(var major : String ="",
var gpa : Float= 0.00f):Person(name = "",id = 0,email = "") {

   override fun inputPerson(){
       //name, id, and email address.
       println("input: your name:")
       name= readLine()!!
       println("input: your id:")
       id= readLine()!!.toInt()
       println("input: your Email address:")
       email= validateEmail(readLine()!!)

       println("input: your major:")
       major= readLine()!!

       println("input: your GPA:")
       gpa= readLine()!!.toFloat()
   }

    override fun printPerson() {
        println("your name: $name\n your id: $id\n your Email: $email")
        println("your major: $major\n your GPA: $gpa")
    }
}