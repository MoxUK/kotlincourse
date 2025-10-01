package module1.chapter2_functional_programming/**
 * Lambda expressions
 * are written within {}
 * e.g. {println("Hello")}..
 */

fun main()  {
    val hello = {println("hello, this is an example of a Lambda function")}
    hello()
    //this is the same as val hello: () -> Unit = {println("...")}

    val printer = {message: String -> println(message)}
    printer("Hey, how you doin'?")

    val sum = {x: Int, y: Int->println(x + y)}
    sum(100, 150)

    val sum2 = {x: Int, y: Int->
        val result = x+y
        println("$x + $y = $result")}
    sum2(100, 151)

    val sum3 = {x: Int, y: Int ->
        val result = x + y
        result
    }
    val result = sum3(99, 99)
    println(result)
}