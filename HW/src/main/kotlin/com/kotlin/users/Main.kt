package com.kotlin.users

import java.lang.Exception

fun main() {
    try {
        println("Enter a choice. 1 for person, 2 for student")
        var choice = readLine()!!.toInt()
        when (choice) {
            1 -> {
                var person1 = Person()
                person1.inputPerson()
                person1.printPerson()
            }
            2 -> {
                var student1 = Student()
                student1.inputPerson()
                student1.printPerson()
            }
            else -> println("You have entered a wrong choice!")
        }
    } catch (e: Exception) {
        println(e.message)
    }

}