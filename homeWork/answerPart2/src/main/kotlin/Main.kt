object Auth{
    private var userName = "hamza"
    private var password = "1234"
    fun validate(_userName:String,_password:String){

    if (userName == _userName && password == _password)
        println("Authorized")
        else
            println("Not Authorized")

    }
}




fun main(args: Array<String>) {

    println("Enter userName: ")
    var userName = readLine()!!.toString()

    println("Enter password: ")
    var password = readLine()!!.toString()

   Auth.validate(userName,password)
}