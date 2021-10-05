package com.kotlin.Challenge

import com.kotlin.inheritance.Circle
import com.kotlin.inheritance.Cylinder

fun main() {
    var human = 2

    while (human != 0 && human != 1) {
        println(
            "This program to create either a Person or Student \n" +
                    "Please Enter 0 to create a Person,or Enter 1 to create a Student"
        )
        human = try {
            (readLine() ?: "").toInt()
        } catch (e: NumberFormatException) {
            2
        }
    }

    if (human == 0) {
        val person = Person()
        person.inputPerson()
        person.printPerson()

    } else if (human == 1) {
        val student = Student()
        student.inputPerson()
        student.printPerson()
    }
}