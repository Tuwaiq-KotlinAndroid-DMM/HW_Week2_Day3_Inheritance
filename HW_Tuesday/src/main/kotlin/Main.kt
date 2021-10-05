import com.kotlin.week2day3hw.Circle
import com.kotlin.week2day3hw.Cylinder

// object in part 2
object Author {
    var name = "hamza"
    var password = "1234"

    fun validate(_userName:String,_password:String){

        if (name == _userName && password == _password)
            println("Authorized")
        else
            println("Not Authorized")
    }
}
fun main(args: Array<String>) {
// part 1
    println("if u want to calculate circle area enter 1 or " +
            "if u want to calculate volume cylinder enter 2")
    var userChoice = readLine()!!.toInt()

    if (userChoice ==1){
        println("input the radius ")
        var radius = readLine()!!.toDouble()
        var circle = Circle(radius)
        var result = circle.getArea()
        println(result)

        // 1 choose
        // input value
        //create object
        //calculate and display
    }

    else if (userChoice==2){
        println("input the radius ")
        var radius = readLine()!!.toDouble()
        println("input the height ")
        var height = readLine()!!.toDouble()
        var cylinder = Cylinder(radius,height)
        var result = cylinder.getVolume()
        cylinder.display(result)
    }
    else
    {
        println("make Sure ur  input 1 or 2 ")
    }


    //part 2
    println("input your username: ")
    var userName = readLine()!!
    println("input youe password: ")
    var password = readLine()!!

    Author.validate(userName,password)

}