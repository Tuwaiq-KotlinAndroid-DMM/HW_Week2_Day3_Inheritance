import com.kotlin.shapes.Circle
import com.kotlin.shapes.Cylinder
import java.lang.Exception

fun main() {
    try {
        println("Please enter a choice: 1 for circle, 2 for cylinder")
        var choice = readLine()!!.toInt()
        when (choice) {
            1 -> {
                println("You have chosen a circle")
                println("please enter the radius of the circle: ")
                var radius = readLine()!!.toDouble()
                var circle = Circle(radius)
                circle.display()
            }
            2 -> {
                println("you have chosen cylinder ")
                println("Please enter the radius of the cylinder: ")
                var radius = readLine()!!.toDouble()
                println("please enter the height of the cylinder")
                var height = readLine()!!.toDouble()
                var cylinder = Cylinder(radius, height)
                cylinder.display()

            }
            else -> println("You have entered a wrong choice!")
        }
    } catch (e: Exception) {
        println(e.message)
    }
}