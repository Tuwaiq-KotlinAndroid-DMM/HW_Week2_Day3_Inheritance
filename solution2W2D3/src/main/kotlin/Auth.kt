object Auth {

     var userName = "hamza"
     var password = "1234"
    fun validate(_userName:String,_password:String){

        if (userName == _userName && password == _password)
            println("Access granted")
        else
            println("Not Authorized")

    }
}