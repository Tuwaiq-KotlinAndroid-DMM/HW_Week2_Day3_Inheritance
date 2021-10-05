package com.kotlin.challenge

open class Person() {
    var name: String
    var ID: Int
    var email: String

    init {
        name = " "
        ID = 0
        email = " "
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
        println("Please enter your name:")
        var nameInput = readLine()!!
        var emailInput: String
        // If the email structure is wrong ask the user to enter it again
        do {
            println("Please enter your email:")
            emailInput = readLine()!!
            if (validateEmail(emailInput))
                email = emailInput
            else println("Invalid email: Valid email structure is example@example.com")
        } while (!validateEmail(emailInput))

        println("Please enter your ID:") // even though I believe it should be auto generated :)
        var idInput = readLine()!!.toInt()

        name = nameInput
        ID = idInput
    }

    open fun printPerson() {
        println("$name's ID is: $ID, and the email is: $email")
    }
}