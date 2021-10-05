package com.kotlin.person

class Student: Person() {

    var major :String
    var gpa:Float

    init {

        major = ""
        gpa = 0f

    }
    override fun inputPerson() {
        super.inputPerson()
        println(" enter your major:")
        var major_ = readLine()!!
        println(" enter your GPA:")
        var gpa_ = readLine()!!.toFloat()

        major = major_
        gpa = gpa_
    }
    override fun printPerson() {
        super.printPerson()
        println("The major is: $major, and the GPA is: ${"%.2f".format(gpa)}")
    }
}