package com.kotlin.Challenge

class Student : Person() {

    private var major: String
    private var gpa: Float

    init {
        major =""
        gpa =0f
    }

    override fun inputPerson(){
        super.inputPerson()

        println("please enter major")
        major = readLine()!!

        println("please enter gpa")
        gpa = readLine()!!.toFloat()

    }

    override fun printPerson() {
        super.printPerson()
        println("major is $major \n" +
                "gpa is $gpa")
    }

}