import com.kotlin.shapes.Circle
import com.kotlin.shapes.Cylinder

fun main() {

    println("Choose either a circle or a cylinder to create")
    var input = readLine()!!
    if (input == "circle")
        println("Enter the radius")
    var r = readLine()!!.toDouble()
    var area = Circle(r).getArea()
    println("The area of circle is $area")
    else if (input == "cylinder") {
        println("Enter the radius")
        var r = readLine()!!.toDouble()
        println("Enter the height")
        var h = readLine()!!.toDouble()
        var cylinderVolume = Cylinder(h, r)
        cylinderVolume.display()
    }
}