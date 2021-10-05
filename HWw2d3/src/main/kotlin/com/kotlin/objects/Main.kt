package com.kotlin.objects

fun main() {
    println("Please enter username")
    var username = readLine()!!

    println("Please enter password")
    var password = readLine()!!

    Auth.validate(username, password)
}

object Auth {

    fun validate(username: String, password: String) {

        if (username == "hamza" && password == "1234")
            println("Authorized")
        else
            println("Not Authorized")
    }
}