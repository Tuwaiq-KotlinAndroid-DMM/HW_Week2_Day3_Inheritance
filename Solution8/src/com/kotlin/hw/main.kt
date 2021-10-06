package com.kotlin.hw



object auth
{
var username="hamza"
var password="1234"

    fun validate(username:String,password:String)
    {
        if(this.username==username && this.password==password)
        {
            println("Authorized")
        }
        else
        {
            println("Not authorized")
        }
    }

}
fun main()
{
    println("Choose between a circle(ci) and a cylinder(cy)")
    var choice= readLine()!!
    if(choice=="ci")
    {
        println("Enter a circle's radius")
        var r= readLine()!!.toDouble()
        var instance1=Circle(r)
        println("The area is "+instance1.getArea())
    }
    else if(choice=="cy")
    {
        println("Enter a cylinder's radius")
        var r2= readLine()!!.toDouble()
        println("Enter a cylinder's height")
        var h= readLine()!!.toDouble()
        var instance2=Cylinder(h,r2)

        println("The volume is "+instance2.getVolume())
    }
    else
    {
        println("Invalid")
    }
    println("------------------part 2 -------------------------------")
    println("Enter your name")
    var name= readLine()!!
    println("Enter your password")
    var password= readLine()!!
    auth.validate(name,password)
    println("------------------part 3 -------------------------------")
    println("Choose between a person(p) and a student(s)")
    var choice2= readLine()!!
    println("Enter your name,id,and email")
    var pname= readLine()!!
    var pid= readLine()!!.toInt()
    var pemail= readLine()!!
    if(choice2=="p")
    {

        var instance3=Person()
        instance3.inputPerson(pname,pid,pemail)
       println( instance3.printPerson())

    }
  else if(choice2=="s")
    {
        var instance4=Student()
        instance4.inputPerson(pname,pid,pemail)
        println(instance4.printPerson())
    }



}
