package com.kotlin.hw

 open class Person {
    private  var  name:String
    private  var id:Int
    private  var email: String


    init {
        name=" "
        id=0
        email=" "

    }


    fun validateEmail(em:String):Boolean
    {
        if (em.contains('@') && em.substringAfterLast('@')==".")
        {
            email=em
            return true
        }
        else {
            return false
        }


    }
   open fun inputPerson(name:String,id:Int,em:String)
    {
       if(validateEmail(em)==true) {
           this.name = name
           this.id = id
       }
        else
       {
           println("Invalid")
       }

    }
  open fun printPerson():String
    {
        return("Name: "+this.name+" .ID: "+this.id+" Email: "+this.email)
    }
}