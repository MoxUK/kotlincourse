package module1.chapter5_collections

/*
* 2. Duplicate Checker
 * Create a class called DuplicateChecker.
 * Write a function that takes a set of numbers and a number to check, and returns true if the number is already in the set, otherwise false.
 */

class DuplicateChecker {
    fun isDuplicate(numbers: Set<Int>, numberToCheck: Int): Boolean {
        return numbers.contains(numberToCheck)
    }
}

fun main() {
    val checker = DuplicateChecker()
    val numbers = setOf(1, 2, 3, 4, 5)

    println(checker.isDuplicate(numbers, 3)) // true
    println(checker.isDuplicate(numbers, 6)) // false
}