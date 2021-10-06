import java.lang.Exception

fun main(args: Array<String>) {
 println("do you want circle or cylinder?")
  var choise = readLine()
   if (choise == "circle"){
    println("plase enter the radius:")
    var radius = readLine()!!.toDouble()
    var c = Circle()
    println("the area of Circle is: ${c.getArea()}")

   } else if (choise == "cylinder"){
    println("please enter the radius:")
    var radius = readLine()!!.toDouble()
    println("please enter the height:")
    var h = readLine()!!.toDouble()
    var cy = Cylinder()
    println("the area of Cylinder is: ${cy.getVolume()}")
   }

}