package com.kotlin.circle


var username : String = "Hamza"
var password : String = "1234"

object validate{

    fun Authorized(user : String,pass : String ){
        if (user == username && pass == password){
            println("Authorized")
        }else{
            println("not authorized")
        }
    }

}

fun main(){
//======================================================================================================================
// Part I: Practice with inheritance
//======================================================================================================================
    println("choose the shape want to calculate its surface area: ")
    println("1: Circle \n 2: Cylinder \n 3: Both \n 4: Cylinder Volume")
    var c = readLine()!!.toInt()
    if (c == 1){ //Circle
        print("Please enter the radius : ")
        var r : Double = readLine()!!.toDouble()
        var circle = Circle(r)
        circle.displayc()
    }
    //------------------------------------------------------------------------------------------------------------------
    else if (c == 2){ //cylinder
        print("Please enter the radius : ")
        var r : Double = readLine()!!.toDouble()
        var cylinder = Cylinder(r,0.0)
        cylinder.displaya()
    }
    //------------------------------------------------------------------------------------------------------------------
    else if (c == 3){ //circle & cylinder
        print("Please enter the radius for the circle: ")
        var r : Double = readLine()!!.toDouble()
        var circle = Circle(r)
        print("Please enter the radius for the cylinder: ")
        var r1 : Double = readLine()!!.toDouble()
        print("Please enter the height for the cylinder: ")
        var h : Double = readLine()!!.toDouble()
        var cylinder = Cylinder(r1,h)
        circle.displayc()
        cylinder.displaya()
    }
    //------------------------------------------------------------------------------------------------------------------
    else if (c == 4){
        print("Please enter the radius for the cylinder: ")
        var r1 : Double = readLine()!!.toDouble()
        print("Please enter the height for the cylinder: ")
        var h : Double = readLine()!!.toDouble()
        var cylinder = Cylinder(r1,h)
        cylinder.displayv()
    }
//======================================================================================================================
// Part II: Practice with objects
//======================================================================================================================
    print("Enter username : ")
    var u = readLine()!!.toString()
    print("Enter password : ")
    var p = readLine()!!.toString()
    validate.Authorized(u,p)

}