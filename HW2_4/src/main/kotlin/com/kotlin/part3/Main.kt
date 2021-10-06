package com.kotlin.part3

fun main() {

    println("Are you a normal person or student")
    var input1= readLine()
    
    if(input1=="person"){
        var per = Person()
        per.inputPerson()
        per.printPerson()

    }else if(input1 == "student"){
        var std= Student()
        std.inputPerson()
        std.printPerson()

    }
}