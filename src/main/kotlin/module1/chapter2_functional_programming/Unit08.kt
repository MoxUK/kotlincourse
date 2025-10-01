package module1.chapter2_functional_programming// Anonymous functions

fun main()  {
    val message = fun() = println("Hello")
    message()

    val sum = fun(x: Int, y: Int): Int = x + y
    val result = sum(10,9) // 10 + 9 = 19
    println(result)
    //alternative way to call
    println(sum(11,11)) //11 + 11 = 22

    doOperation(9 , 5,fun(x: Int, y: Int): Int = x + y) // 9 + 5 = 14
    doOperation(9 , 5,fun(x: Int, y: Int): Int = x - y) // 9 - 5 = 4

    var action1 = selectActionForOperation(1)
    println(action1(4, 5)) // 4 + 5 = 9
    action1 = selectActionForOperation(2)
    println(action1(4, 5)) // 4 - 5 = -1
}

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int)  {
    println(op(x, y))
}

fun selectActionForOperation(key: Int): (Int, Int) -> Int   {
    when(key)   {
        1 -> return fun(x: Int, y: Int): Int = x + y
        2 -> return fun(x: Int, y: Int): Int = x - y
        else -> return fun(x: Int, y: Int): Int = 0
    }
}

