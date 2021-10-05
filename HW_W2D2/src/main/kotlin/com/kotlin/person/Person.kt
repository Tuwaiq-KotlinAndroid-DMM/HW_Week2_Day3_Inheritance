package com.kotlin.person
//Q3
open class Person {
    var name: String
    var id: Int
    var email: String

    init {

        name = ""
        id = 0
        email = ""


    }

    fun validateEmail(em: String): Boolean {
        return if (em.contains('@') && em.contains('.')) {
            email = em
            true
        } else {
            false
        }

    }

    open fun inputPerson() {
        var userName = readLine()!!
        println("please type your name here: ")
        do {
            println("Please enter your email:")
            userName = readLine()!!
            if (validateEmail(userName))
                email = userName
            else println("email doesn't exist, please make sure to type it right")
        } while (!validateEmail(userName))

        println("Please enter your ID:")
        var idInput = readLine()!!.toInt()

        name = userName
        id = idInput
    }

    open fun printPerson() {
        println(" the name is: $name \n the Id is: $id \n the email is the email is: $email")


    }
}

fun main() {
    println("Choose if you want a person type '1' and student type '2'")
    var choice = readLine()!!

    if (choice == "1") {
        var person = Person()
        person.inputPerson()
        person.printPerson()
    } else if (choice == "2") {
        var student = Student()
        student.inputPerson()
        student.printPerson()
    } else (println("Please choose either 1 or 2"))

}