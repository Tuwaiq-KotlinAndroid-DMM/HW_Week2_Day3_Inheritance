package com.kotlin.part3
//======================================================================================================================
//Part 3
//======================================================================================================================

open class Person( ) {
    var name : String
    var id : Int
    var email: String
    init{
        name = ""
        id = 0
        email = ""
    }
    fun validateEmail(em:String):Boolean{
    //Verifies that the passed email address contains one @ character and at least one period after the @ character.
    // If the passed email is valid, copy the passed parameter to the object's email member variable and return true,
    // false otherwise.
        val EMAIL_REGEX = "[a-zA-Z0-9._-]+@[a-zA-Z]+\\\\.+[a-zA-Z]+"
        return EMAIL_REGEX.toRegex().matches(email)
    }
    open fun inputPerson(_name:String, _id:Int, _email:String){
        name = _name
        id = _id
        var isValid = validateEmail(_email)
        if (isValid)
            email = _email
        else
            email = "your email is not valid for save"
    }
    open fun printPerson(){
        println("name is: $name\n" +
                "id is: $id\n" +
                "email is: $email")
    }

 class Student(): Person() {
        var major: String
        var gpa: Float

        init {
            major = ""
            gpa = 0f
        }
        override fun inputPerson(_name: String, _id: Int, _email: String) {
            name = _name
            id = _id
            var isValid = validateEmail(_email)
            if (isValid)
                email = _email
            else
                email = "your email is not valid"
            println("Enter your major: ")
            major = readLine()!!
            println("enter your GPA: ")
            gpa = readLine()!!.toFloat()
        }
        override fun printPerson() {
            println(
                "name is: $name\n" +
                        "id is: $id\n" +
                        "email is: $email\n" +
                        "major is: $major\n" +
                        "GPA is: $gpa"
            )
        }
    }
}