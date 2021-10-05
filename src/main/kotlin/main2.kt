//part1
open class Circle {
    open var radius: Double = 0.0 //"default value"
    open fun area(): Double {
        return radius * radius * 3.14
    }
}
class Cylinder : Circle() {
    var height: Double = 0.0 //"default value"
    override var radius = 0.0 //"default value"
    override fun area(): Double {
        return (2.0 * 3.14 * radius * height) + (2 * 3.14 * radius * radius)
    }

    fun volume(): Double {
        return 3.14 * radius * radius * height
    }

}

fun main() {
    val circle = Circle()
    val cylinder = Cylinder()
    print("create either a circle or cylinder: ")
    val create = readLine()!!
    when (create) {
        "circle" -> {
            print("put radius: ")
            circle.radius = readLine()!!.toDouble()
            println("Area is ${circle.area()}")
        }
        "cylinder" -> {
            print("put radius: ")
            cylinder.radius = readLine()!!.toDouble()
            print("put height: ")
            cylinder.height = readLine()!!.toDouble()
            println("Area is ${cylinder.area()} and volume is ${cylinder.volume()} ")
        }
        else -> println("sory you put wrong value ")
    }
}

