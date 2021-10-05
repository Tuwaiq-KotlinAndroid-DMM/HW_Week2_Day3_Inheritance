object Auth{

    fun Validate(){

       var username : String = "hamza"
        var password : String = "1234"

        println("please enter your username :")
        var name = readLine()!!.toString()
        println("please enter your password :")
        var pass = readLine()!!.toString()
        if (username == name && password == pass)
          println("Authorized")
        else {
            println("Not Authorized")


    }


}}

fun main() {
    Auth.Validate()}