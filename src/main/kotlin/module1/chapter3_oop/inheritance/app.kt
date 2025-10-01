package inheritance

import jdk.jshell.SourceCodeAnalysis

//Inheritance
fun main()  {
    val bob : Employee = Employee()
    bob.name = "Bob"
    bob.printName()

    val robert : Employee2 = Employee2("Robert", "Oracle")
    robert.printName2()
    robert.printCompany()

    val chris = Person3("Christopher")
    chris.age = 17
    chris.description()
    println(chris.fullInfo)

    val john = Employee3("Johnny")
    john.age = 21
    john.description()
    println(john.fullInfo)
}

open class Person {
    var name: String = "Undefined"

    fun printName() {
        println(name)
    }
}

class Employee : Person()  {
}

/** Alernative way
class Empployee : Person{
    constructor()   : super()
}
 */

open class Person2(val name: String)    {
    fun printName2()    {
        println(name)
    }
}

open class Employee2(empName: String, val company: String) : Person2(empName){
    fun printCompany()  {
        println(company)
    }
}

class Managers(personName : String) : Person2(personName)   {
}

class Managers2(personName: String, company: String) : Employee2(personName, company)   {
    //if Person2 is an OPEN class, then a class can inherited from multiple classes in a string
}

open class  Person3(val name: String)   {
    //open var age: Int = 1
    open val fullInfo: String
        get ()  {
            return "Person $name - $age"
        }
    open var age: Int = 1
        set(value)  {
            if (value in 1..100)    {
                field = value}
            }
    fun printName3()    {
        println(name)
    }
    open fun description()  {
        println("Description of Person")
    }
}

open class Employee3(empName: String) : Person3(empName)   {
    override val fullInfo: String
        get() {
        return "Employee $name - $age"
    }
    override var age: Int = 18
        set(value)  {
            if (value in 18..100)   {
                field = value
            }
        }
    override fun description()  {
        println("Description of employee")
    }
    //stop override with syntax 'final override fun description() { ... }'
}

