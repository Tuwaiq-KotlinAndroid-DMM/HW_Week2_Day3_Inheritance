import com.kotlin.hw.Person
import com.kotlin.hw.Student

fun main(args: Array<String>) {
   var name:String
   var id: Int
   var email:String
   var major :String
   var GPA: Float
    println("if your Student enter Student, if Person enter Person")
    var inputUser = readLine()!!.uppercase()
    when(inputUser){
        "STUDENT" -> {
            println("Enter your name: ")
            name = readLine()!!
            println("Enter your ID: ")
            id = readLine()!!.toInt()
            println("Enter your Email: ")
            email = readLine()!!

            var student = Student()
            student.inputPerson(name,id,email)
            student.printPerson()
        }
        "PERSON" ->{
            println("Enter your name: ")
            name = readLine()!!
            println("Enter your ID: ")
            id = readLine()!!.toInt()
            println("Enter your Email: ")
            email = readLine()!!

            var person = Person()
            person.inputPerson(name,id,email)
            person.printPerson()
        }

        else -> println("Sure input Student or Person")
    }
}