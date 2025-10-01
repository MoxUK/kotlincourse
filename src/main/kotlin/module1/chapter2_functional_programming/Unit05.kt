package module1.chapter2_functional_programming//Function Overloading
fun main()  {
    val a = summary(1, 2)
    val b = summary(1.0, 2.0)
    val c = summary(1, 2.2)
    println("a = $a")
    println("b = $b")
    println("c = $c")

}

fun summary(a: Int, b: Int) = a +b

fun summary(a: Double, b: Double) = a + b

fun summary(a: Int, b: Int, c: Int) = a + b + c

fun summary(a: Int, b: Double) = a + b
