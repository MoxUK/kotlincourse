package module1.chapter5_collections

/**
 * Create a class called MathUtils.
 * Add a function that takes a list of integers and returns the sum of all even numbers in the list.
 */

fun main()  {
    val mathUtils = MathUtils()  // create an object of MathUtils

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val sum = mathUtils.sumOfEvens(numbers)  // call the sumOfEvens function

    println("The sum of even numbers is $sum")
}
class MathUtils {
    // 4 / 2 = 2       (4 % 2 = 0)
    // 3 / 2 = 1.5 --> result is 1 as class operates with integers, so 3 % 2 = 1
    fun sumOfEvens(numbers: List<Int>): Int {
        return numbers.filter { it % 2 == 0 }.sum()
    }
}