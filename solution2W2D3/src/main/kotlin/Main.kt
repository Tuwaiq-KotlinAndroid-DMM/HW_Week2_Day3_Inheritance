
    fun main(args: Array<String>) {

        println("Enter userName: ")
        var userName = readLine()!!.toString()

        println("Enter password: ")
        var password = readLine()!!.toString()

        Auth.validate(userName,password)
    }
