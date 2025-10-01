package module1.chapter2_functional_programming


fun main() {
    sayHello()
    greeting("Artyom")
    val name = "Samson"
    greeting(name)
    val result = add(5, 9)
    println(result)

    displayUser("Bob", 21)
    displayUser("Richard", 25, "Manager")
    displayUser("Kate", position = "Developer", age = 23) //change of order of parameters

    doubleValue(8)

    var numbers = intArrayOf(4, 5, 6,)
    for (n in numbers) {
        print("$n \t")
    }

    double(1, numbers)
    for (n in numbers) {
        print("$n \t")
    }
}

// function without parameters
fun sayHello()  {
    println("Hello")
}

// function with parameters
fun greeting(name: String) {
    println("Hello, $name")
}

fun add(a: Int, b: Int): Int    {
    return a + b
}

fun displayUser(name: String, age: Int, position: String ="unemployed") {
    println("Name: $name, Age: $age, $position")
}

fun doubleValue(number: Int)    {
    //number = number * 2 //This results in an error
    println("Value: $number")
}

fun double(position: Int, numbers: IntArray)   {
    numbers[position] = numbers[position] * 2
    println("Value: $numbers")
}

