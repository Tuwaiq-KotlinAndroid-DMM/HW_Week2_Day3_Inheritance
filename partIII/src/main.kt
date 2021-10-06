fun main(args: Array<String>) {
    var name:String
    var id: Int
    var email:String
    var major :String
    var GPA: Float
    println("Press '1' if you are student,Press '2' if you are a Person")
    var inputUser = readLine()!!.toInt()
    while(inputUser > 2 || inputUser < 1){
        println("Please!! Press '1' if you are student,Press '2' if you are a Person")
        inputUser = readLine()!!.toInt()
    }
    if(inputUser == 1){
        println("Enter your name:")
        name = readLine()!!
        println("Enter your ID:")
        id = readLine()!!.toInt()
        println("Enter your email:")
        email = readLine()!!
    }else {
        println("Enter your name:")
        name = readLine()!!
        println("Enter your ID:")
        id = readLine()!!.toInt()
        println("Enter your email:")
        email = readLine()!!

        var person = Person()
        person.inputPerson(name,id,email)
        person.printPerson()
    }


}