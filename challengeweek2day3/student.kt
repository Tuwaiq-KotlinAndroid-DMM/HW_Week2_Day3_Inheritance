package com.kotlin.challengeweek2day3

class Student() : Person() {
    var major: String
    var gpa: Float

    init {
        major = " "
        gpa = 0f
    }

    override fun inputPerson() {
        super.inputPerson()
        println("Please enter your major:")
        var majorInput = readLine()!!
        println("Please enter your GPA:")
        var gpaInput = readLine()!!.toFloat()

        major = majorInput
        gpa = gpaInput
    }

    override fun printPerson() {
        super.printPerson()
        println("The major is: $major, and the GPA is: ${"%.2f".format(gpa)}")
    }
}