object Auth {
    var username = "hamza"
    var password = 1234
    fun validate(){
        println("Enter your username:")
        var uname = readLine()!!.toString()
        println("Enter your password:")
        var pass = readLine()!!.toInt()
        if (uname == username && pass == password) {
            println("Authorized")}
        else {println("Not Authorized")}
    }}
fun main() {
    Auth.validate()}