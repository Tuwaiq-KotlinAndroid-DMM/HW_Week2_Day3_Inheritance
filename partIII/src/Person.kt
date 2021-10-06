import java.util.regex.Pattern

open class Person{
    var name:String
    var email:String
    var id:Int
    init {
        name = ""
        email = ""
        id = 0
    }

    fun isEmailValid(email: String): Boolean {
        val EMAIL_REGEX = "[a-zA-Z0-9._-]+@[a-zA-Z]+\\\\.+[a-zA-Z]+"
        return EMAIL_REGEX.toRegex().matches(email)

    }

    open fun inputPerson(_name:String ,_id:Int,_email:String){
        name = _name
        id = _id
        var valid = isEmailValid(_email)
        if (valid) {
            email = _email
        }else{
            println("Invalid email")
        }

    }

   open fun printPerson(){
        println("Name is : $name")
        println("Email is : $email")
        println("ID is : $id")
    }

}


class Student():Person(){
    var major:String
    var gpa:Float

    init{
           major = ""
           gpa = 0f
    }

    override fun inputPerson(_name:String ,_id:Int,_email:String){
        name = _name
        id = _id

        var valid = isEmailValid(_email)
        if (valid) {
            email = _email
        }else{
            println("Invalid email")
        }
        println("Enter your major")
        major = readLine()!!
        println("Enter GPA:")
        gpa = readLine()!!.toFloat()

    }

   override fun printPerson(){
       println("Name is : $name")
       println("Email is : $email")
       println("ID is : $id")
    }


}