

//Q2
object Auth {


    fun validate() {

        var userName = "Hamza"
        var passWord = "1234"

        print("please enter username: ")
        var u = readLine()!!
        print("please enter password: ")
        var p = readLine()!!
        if (userName==u && passWord == p ) {
            println("Authorized")
        } else {
            println("Unauthorized")
        }
    }
}

fun main() {
    Auth.validate()}