package com.kotlin.challenge

// Part 3 - Challenge
fun main() {
    println("Please choose from the following:\n1. Person\t\t2. Student")
    var choice = readLine()!!
    when (choice) {
        "1" -> {
            var person = Person()
            person.inputPerson()
            person.printPerson()
        }
        "2" -> {
            var student = Student()
            student.inputPerson()
            student.printPerson()
        }
        else -> println("Please choose either 1 or 2")
    }
}