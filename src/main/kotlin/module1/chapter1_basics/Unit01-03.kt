package module1.chapter1_basics

//Updated
class Unit02 {
}
fun main()  {
    println("Hello world")
    println("Hello Kotlin")

    // Use val for a constant value
    val name: String = "Artyom"

    // Use var for a variable
    var age: Int = 30
    age = 31

    val a = 10
    val b = 5
    val c = a + b
    println(c)

    val isGreater : Boolean = a > b
    println(isGreater)

    var count = 1
    println(count)
    count++
    print(count)

    print("Enter a name: ")
    val yourName = readLine()
    println("Your name $yourName")
}

// Single line comment
/**
multi
line
comment
 */