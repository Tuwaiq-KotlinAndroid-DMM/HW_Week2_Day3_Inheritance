package com.kotlin.part2

object auth{
fun validate(user:String,pass:String){
    if(user == "hamza" && pass=="1234")
        println("Authorized")
    else
        println("you are not Authorized")

}
}

fun main() {
 println("Enter your username: ")
    val user = readLine()!!
    println("Enter your password ")
    val pass = readLine()!!

    auth.validate(user,pass)

}
