package module1.chapter5_collections

/**Unit 10: Sorting - 2. Sort Descending
Create a function that takes a list of numbers and returns them sorted in descending order.*/

fun main() {
    val numbers = listOf(1, 20, 43, 42, 10, 23, 19, 14, 13, 100, -4, 12, 69, 44, 9, 7)
    val sorted = sortDescending(numbers)
    println(sorted)
}

fun sortDescending(list: List<Int>): List<Int> {
    return list.sortedDescending()
}
