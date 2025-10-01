package module1.chapter2_functional_programming/**
 * High Order Functions in kotlin
 */

fun main()  {
    displayMessage(::morning)
    displayMessage(::evening)

    action(5,3, ::subtractTwo)
    action(5,3, ::multiplyTwo)

    val action1 = selectAction(1)
    println(action1(10, 5))

    val action2 = selectAction(2)
    println(action2(10, 5))
}

fun displayMessage(message: () -> Unit)    {
    message()
}

// () -> Unit
fun morning()   {
    println("Good morning")
}

// () -> Unit
fun evening()   {
    println("Good evening")
}

fun action(n1: Int, n2: Int, op: (Int, Int) -> Int)  {
    val result = op(n1, n2)
    println(result)
}

// (Int, Int) -> Int
fun subtractTwo(a: Int, b: Int): Int {
    return a - b
}

// (Int, Int) -> Int
fun multiplyTwo(a: Int, b: Int): Int    {
    return a * b
}

fun emptyReturn(a: Int, b: Int): Int {
    return 0
}

fun selectAction(key: Int): (Int, Int) -> Int   {
    when(key)   {
        1 -> return:: subtractTwo
        2 -> return:: multiplyTwo
        else -> return ::emptyReturn
    }
}