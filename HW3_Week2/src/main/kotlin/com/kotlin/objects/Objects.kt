package com.kotlin.objects

import javax.print.attribute.standard.JobOriginatingUserName

object Auth {
    fun validate(userName: String, password: String) {
        if (userName.lowercase() == "hamza" && password == "1234")
            println("Authorized")
        else
            println("Not Authorized")
    }
}

fun main() {
    println("Please enter the username:")
    var username = readLine() ?: "null"
    println("Please enter your password:")
    var password = readLine() ?: "null"

    Auth.validate(username, password)
}