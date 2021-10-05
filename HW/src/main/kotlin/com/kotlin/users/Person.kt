package com.kotlin.users

open class Person {
    var name: String
    var id: Int
    var email: String

    init {
        name = ""
        email = ""
        id = 0
    }

    fun validateEmail(em: String): Boolean {
        if (em.indexOf("@") != -1) {
            if (em.indexOf(".") > em.indexOf("@")) {
                email = em
                return true
            } else {
                return false
            }
        } else {
            return false

        }
    }

   open fun inputPerson() {
        println("Enter your name: ")
        name = readLine()!!
        println("Enter the id: ")
        id = readLine()!!.toInt()
        println("Enter your email: ")
        var emailEntered = readLine()!!
        validateEmail(emailEntered)

    }
    open fun printPerson(){
        println("Name: $name")
        println("id: $id")
        println("Email: $email")
    }


}
