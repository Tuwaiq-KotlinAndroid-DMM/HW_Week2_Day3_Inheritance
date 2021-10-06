package com.kotlin.Challenge

open class Person(var name: String, var id: Int, var email: String) {


     fun validateEmail(em: String): Boolean {
        if (em.contains("@") && em.contains(".")) {
            email = em
            return true
            println("valid")
        } else {
            return false
            println("invalid")
        }
    }

    open fun inputPerson() {
        println("Enter the name")
        name = readLine()!!
        println("Enter the name")
        email = readLine()!!
        println("Enter the name")
        id = readLine()!!.toInt()


    }

    open fun printPerson() {
        println("name: $name \n email: $email \n $id")

    }

    init {
        name = ""
        email = ""
        id = 0
    }

}