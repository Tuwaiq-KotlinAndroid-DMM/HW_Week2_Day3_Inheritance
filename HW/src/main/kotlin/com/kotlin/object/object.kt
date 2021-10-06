package com.kotlin.`object`

object Auth {

    fun validate(username: String, password: String) {
        if(username == "Hamza"&& password == "1234"){
            println("Authorized")
        }else{
            println("Not Authorized")
        }

    }
}