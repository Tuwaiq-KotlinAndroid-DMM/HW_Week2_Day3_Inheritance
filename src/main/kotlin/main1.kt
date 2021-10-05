//part2
object Auth {
    var username: String = "default value"
    var password: Int = 0 // "default value"

    fun chech(): String {
        if (username == "hamza" && password == 1234) return "Authorized"
        else return "Not Authorized"
    }
}

fun main() {
    print("Enter your username: ")
    Auth.username = readLine()!!
    print("Enter your password: ")
    Auth.password = readLine()!!.toInt()
    println(Auth.chech())

}
