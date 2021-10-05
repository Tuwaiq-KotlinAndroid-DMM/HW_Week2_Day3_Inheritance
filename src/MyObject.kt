object Auth {


    fun validate(username: String, password: String): String {

        if (username == "hamza" && password == "1234") {

            return "Authorized"
        } else {
            return "Not Authorized"
        }
    }
}

fun main() {
    println("Enter username here: ")
    var v1 = readLine()!!
    println("Enter password here: ")
    var v2 = readLine()!!
    var to_check:String
    to_check = Auth.validate(v1,v2)
    println(to_check)


}