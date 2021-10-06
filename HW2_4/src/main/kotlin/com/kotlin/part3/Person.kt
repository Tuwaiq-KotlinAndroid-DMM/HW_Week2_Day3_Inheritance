package com.kotlin.part3

open class Person(var name:String="",var id:Int=0,var email:String="") {
    var at = "@"
    fun validateEmail(em: String): String {
        if (em.contains(at) && at == em.repeat(1)) {
            println("Email is passed ")
            return em
        } else {
            return "missing"
        }
    }

    open fun inputPerson(){
        //name, id, and email address.
        println("input: your name:")
        name= readLine()!!
        println("input: your id:")
        id= readLine()!!.toInt()
        println("input: your Email address:")
        email= validateEmail(readLine()!!)
    }
    open fun printPerson(){
        println("your name: $name\n your id: $id\n your Email: $email")

    }
}
