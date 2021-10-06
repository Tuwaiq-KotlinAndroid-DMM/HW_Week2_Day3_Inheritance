fun main(){

    println("'1'- for Circle , '2'- for Cylinder")
    var choose = readLine()!!.toInt()
    while (choose < 1 || choose > 2) {
        println("Please:'1'- for Circle , '2'- for Cylinder")
        choose = readLine()!!.toInt()
    }
        if (choose == 1) {
            println("Enter the radius of the Circle:")
            var input = readLine()!!.toDouble()
            var c = Circle(input)
            println("this is the value of the circle ${c.getArea()}")
        } else if (choose == 2) {
            println("Enter the radius of the Circle:")
            var input = readLine()!!.toDouble()
            println("Enter the height of the Cylinder:")
            var input2 = readLine()!!.toDouble()
            var c = Cylinder(input2, input)
            println("this the result of the surface area of the cylinder: ${c.display()}")
        }

}