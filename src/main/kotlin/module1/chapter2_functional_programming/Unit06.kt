package module1.chapter2_functional_programming/**
Function type in Kotlin
 */

//format
//(parameterTypes) -> returnType

fun main()  {
    val message: () -> Unit = ::helloWorld
    message()

    var operation: (Int,Int) -> Int = ::additionOfTwoNumbers
    val result1 = operation(1,3)
    println(result1)

    operation = ::subtractOfTwoNumbers
    val result2 = operation(1, 3)
    println(result2)
}

// () -> Unit
fun helloWorld(): Unit  {
    println("Hello World!")
}

// (Int,Int) -> Int
fun additionOfTwoNumbers(a: Int,b: Int): Int    {
    return a + b
}

// (Int,Int) -> Int
fun subtractOfTwoNumbers(a: Int, b: Int): Int   {
    return a - b
}