
var userName = "hamza"
var passowrd = "12334"
object Auth{


    fun valid(_userName:String,_passward:String){
        if(userName == _userName && passowrd == _passward){
            println("Authorized")
        }else
            println("Not Authorized")
    }
}

fun main(){
    Auth
    println("Enter your user name:")
    var user = readLine()!!
    println("Enter your password")
    var pass = readLine()!!
    Auth.valid(user,pass)
}