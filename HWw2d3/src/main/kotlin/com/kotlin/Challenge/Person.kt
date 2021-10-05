package com.kotlin.Challenge

open class Person() {

    private var name: String
    private var id: Int
    private var email: String

    init {
        name = ""
         email = ""
         id = 0
    }

    private fun validateEmail(em: String): Boolean {

        if (em.contains('@')) {
            email = em
            return true
        } else {
            return false
        }
    }
    open fun inputPerson() {

        println("please enter name")
        name = readLine()!!

        while (!validateEmail(email)){
            println("please enter valid email")
            email = readLine()!!
        }

        println("please enter id")
        id = readLine()!!.toInt()

    }

   open fun printPerson() {

        println("Name is $name \n" +
                "Id is $id \n" +
                "Email is $email")
    }
}