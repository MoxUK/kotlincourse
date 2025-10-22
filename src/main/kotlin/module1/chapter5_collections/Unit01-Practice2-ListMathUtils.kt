package kotlin.module1.chapter5_collections

/**
 * Create a class called MathUtils.
 * Add a function that takes a list of integers and returns the sum of all even numbers in the list.
 */
class `Unit01-Practice2-ListMathUtils` {
    // 4 / 2 = 2       (4 % 2 = 0)
    // 3 / 2 = 1.5     (3 % 2 = 1)
    fun sumOfEvens(numbers: List<Int>): Int {
        return numbers.filter { it % 2 == 0 }.sum()
    }
}