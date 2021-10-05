package com.kotlin.HW

object Auth {
    var username="hamza"
    var password= 1234
    fun valid_user(){
        println("enter username:")
        var one= readLine()!!.toString()
        println("enter password")
        var two= readLine()!!.toInt()

    if (one == username && two == password) {
        println("User is valid")
    }
    else
    println("invalid user")


}}

fun main(){
    Auth.valid_user()
}