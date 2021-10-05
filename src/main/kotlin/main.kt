//part3
open class Person {
    open var name: String = ""
    open var id: Int = 0
    open var email: String = ""
    open fun check(): Boolean {
        return if ("@" in email) true
        else false
    }
    open fun put() {
        print("Enter your name:")
        name = readLine()!!
        print("Enter your id: ")
        id = readLine()!!.toInt()
        print("Enter your email: ")
        email = readLine()!!
    }
    open fun printPe() {
        print("name is $name ,id is $id ,and email is $email")
    }
}
class Student : Person() {
    var major: String = "default value"
    var gpa: Float = 0f //"default value"

    override fun printPe() {
        print("name is $name ,id is $id ,email is $email ,major is $major ,and gpa is $gpa ")
    }

    override fun put() {
        print("Enter your name:")
        name = readLine()!!
        print("Enter your id: ")
        id = readLine()!!.toInt()
        print("Enter your majer: ")
        major = readLine()!!
        print("Enter your gpa: ")
        gpa = readLine()!!.toFloat()
        print("Enter your email: ")
        email = readLine()!!

    }
}

fun main() {
    val person = Person()
    val student = Student()
    print("create either a person or student: ")
    val either = readLine()!!
    when (either) {
        "person" -> {
            person.put()
            println(person.check())
            person.printPe()
        }
        "student" -> {
            student.put()
            println(student.check())
            student.printPe()
        }
        else -> println("sory you put wrong value ")
    }
}

