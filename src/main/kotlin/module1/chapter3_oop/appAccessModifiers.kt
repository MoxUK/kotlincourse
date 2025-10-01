package module1.chapter3_oop/**
 * public - visible everywhere
 * private - only this file or class can use it. Use it to hide anything that should not be usable outside
 * protected
 * Internal
 */

fun main()  {
    val user = User("Tom", 3)
    user.printPerson()
}

class User(private val name: String, _age: Int) {
    private val age = _age

    fun printPerson(){
        printName()
        printAge()
    }

    private fun printName() {
        println("Name is $name")
    }

    private fun printAge() {
        println("Age is $age")
    }
}


    class Person {
        public var name = "Undefined"
        private var age = 18

        public fun printPerson() {
            println("Name: $name, age: $age")
        }
    }

