package com.kotlin.objects

object Auth {
    fun validate(username: String, password: String) {
        if (username.equals("hamza") && password.equals("1234")) {
            println("Authorized")
        } else {
            println("Not Authorized")
        }
    }
}

fun main() {
    println("Please enter the username: ")
    var username = readLine()!!
    println("Please enter the password: ")
    var password = readLine()!!
    Auth.validate(username, password)


}