open class Person {
    var name: String
    var id: Int
    var email: String

    init {
        name = ""
        id = 0
        email = ""
    }
    fun validateEmail(ha: String): Boolean {
        return if (ha.contains('@') && ha.contains('.')) {
            email = ha
            true
        } else {
            false
        }
    }
    open fun inputPerson() {
        var Name = readLine()!!
        println("please type your name here: ")
        do {
            println("Please enter your email:")
            Name = readLine()!!
            if (validateEmail( Name))
                email = Name
            else println("email doesn't exist, please make sure to type it right")
        } while (!validateEmail(Name))

        println("Please enter your ID:")
        var idInput = readLine()!!.toInt()

        name = Name
        id = idInput
    }
    open fun printPerson() {
        println(" the name is: $name \n the Id is: $id \n the email is the email is: $email")
    }
}

fun main() {
    println("Choose if you want a person type '1' and student type '2'")
    var choice = readLine()!!

    if (choice == "1") {
        var person = Person()
        person.inputPerson()
        person.printPerson()
    } else if (choice == "2") {
        var Hi: String
        var hi = Hi()
        hi.inputPerson()
        hi.printPerson()
    } else (println("Please choose either 1 or 2"))

}