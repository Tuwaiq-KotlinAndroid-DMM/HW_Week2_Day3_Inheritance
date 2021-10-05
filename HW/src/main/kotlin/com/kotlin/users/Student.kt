package com.kotlin.users

class Student : Person() {
    var major: String
    var gpa: Float

    init {
        major = ""
        gpa = 0f
    }

    override fun inputPerson() {
        super.inputPerson()
        println("Enter your major: ")
        major = readLine()!!
        println("Enter your gpa: ")
        gpa = readLine()!!.toFloat()

    }

    override fun printPerson() {
        super.printPerson()
        println("Major: $major")
        println("GPA : ${"%.2f".format(gpa)}")
    }

}