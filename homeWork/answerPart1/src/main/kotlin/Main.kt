import com.kotlin.hw.Circle
import com.kotlin.hw.Cylinder

fun main(args: Array<String>) {
    var radius :Double
    var height :Double


    println("Inter 1 to circle and 2 to cylinder: ")
    var inputUser = readLine()?.toInt()
    when (inputUser){
        1 -> {
            println("input raduis: ")
            radius = readLine()!!.toDouble()
            var calculateCicral = Circle(radius)
            println(calculateCicral.getArea())
        }
        2 -> {
            println("input radius: ")
            radius = readLine()!!.toDouble()
            println("input height: ")
            height = readLine()!!.toDouble()
            var calculateCylinder = Cylinder(radius,height)

            calculateCylinder.display()

        }
        else -> println("sure inter number 1 or 2")
    }


}