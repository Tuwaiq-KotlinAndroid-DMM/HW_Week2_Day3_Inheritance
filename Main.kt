object Auth {
    var username = "hamza"
    var password = 1234

    fun validate(){
        println("Enter your username:")
        var n = readLine()!!.toString()

        println("Enter your password:")
        var p = readLine()!!.toInt()

        if (n == username && p == password) {
            println("Authorized")}

        else {println("Not Authorized")}
    }
}
fun main() {
    Auth.validate() }