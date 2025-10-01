package module1.chapter2_functional_programming

//Single-expression function
//fun functionName(parameters) = expression

fun main () {
    val a = square(5)
    val b = square(6)
    println("The square of 5 is $a and the square of 6 is $b")

    compareAge(10, 12)
}

fun square(x: Int) = x * x

//local (nested) functions
fun compareAge(ageOne: Int, ageTwo: Int)    {
    fun ageIsValid(age: Int): Boolean    {
        return age in 1 .. 99
    }
    if (!ageIsValid(ageOne) || !ageIsValid(ageTwo)) {
        println("Invalid age")
        return
    }

    when    {
        ageOne == ageTwo -> println("ageOne = ageTwo")
        ageOne > ageTwo -> println("ageOne is greater than ageTwo")
        ageOne < ageTwo -> println("ageOne is smaller than ageTwo")
    }

}