package com.kotlin.Challenge

class Student(var major:String, var gpa:Float, name: String, id: Int, email: String):Person(name, id, email) {
    override fun inputPerson() {
        println("Enter the name")
        name = readLine()!!
        println("Enter the email")
        email = readLine()!!
        println("Enter the id")
        id = readLine()!!.toInt()
        println("Enter the major")
        major = readLine()!!.toString()
        println("Enter the gpa")
        gpa = readLine()!!.toFloat()

    }

    override fun printPerson() {
        println("name: $name \n email: $email \n id: $id \n major: $major \n gpa :$gpa")
    }

    init {
        major = ""
        gpa = 0F
    }
}