package animal

class Dog(val _name: String,
           val _age: Int) {

    fun bark() {
        println("Woof! My name is $_name")
    }

    fun dogInfo()   {
        println("Dog Info:\nName: $_name\nAge: $_age\n----------------------")
    }
}
