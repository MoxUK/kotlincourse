package social

class User(val _name: String,
           val _age:Int,
           val _nickname: String) {

    var age: Int = _age
    set(value)  {
        println("_age $_age")

        if(value in 13 .. 120)  {
            field = value
            println("Value $value")
        }
    }
    val isTeen: Boolean
        get()   {
            return age in 13 .. 19
        }
    fun sendMessage()   {
        println("Hello from $_name. Your login is $_nickname.")
    }

}