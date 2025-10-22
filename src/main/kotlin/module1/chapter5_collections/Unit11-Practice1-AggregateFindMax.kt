package module1.chapter5_collections

/**Unit 11: Aggregate Operations - 1. Find Max
Write a function that takes a list of numbers and returns the largest number.*/

fun main() {
    val numbers = listOf(1, 20, 43, 42, null, 10, 23, 19, 14, 13, 100, -4, 12, 69, 44, 9, 7)
    val largest = findLargest(numbers.filterNotNull()) //added filterNotNull to handle lists with Int and Null
    println("The largest number in the list is is $largest")
}

fun findLargest(list: List<Int>): Int? {
    return list.maxOrNull()
}
