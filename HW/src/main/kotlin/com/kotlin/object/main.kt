package com.kotlin.`object`

fun main() {
    println("Enter your username:")
    var name = readLine()!!
    println("Enter your password ")
    var pass = readLine()!!
    Auth.validate(name, pass)
}