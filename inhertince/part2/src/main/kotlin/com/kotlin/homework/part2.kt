package com.kotlin.homework

object Auth {
    var username = "hamza"
    var password = 1234

    fun vaildate(user:String,pass:Int){

        println("Enter your username:")
        var user = readLine()!!.toString()

        println("Enter password")
        var pass = readLine()!!.toInt()

        if (user == username && pass == password){

            println("Authorized")
        }
        else{
            println("not Authorized")
        }

    }
}

fun main(){
    Auth.vaildate("Hamza", 1234)
}