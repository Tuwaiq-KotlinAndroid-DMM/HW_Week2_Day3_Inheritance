import com.kotlin.w2d3inheritance.Circle
import com.kotlin.w2d3inheritance.Cylinder

fun main(args: Array<String>) {
    var radius :Double
    var height :Double


    println("Inter 1 to circle and 2 to cylinder: ")
    var inputUser = readLine()?.toInt()
    when (inputUser){
        1 -> {
            println("input raduis: ")
            radius = readLine()!!.toDouble()
            var calculateCircle = Circle(radius)
            println(calculateCircle.getArea())
        }
        2 -> {
            println("input radius: ")
            radius = readLine()!!.toDouble()
            println("input height: ")
            height = readLine()!!.toDouble()
            var calculatecylinder = Cylinder(radius,height)

            calculatecylinder.display()

        }
        else -> println("sure inter number 1 or 2")
    }


}