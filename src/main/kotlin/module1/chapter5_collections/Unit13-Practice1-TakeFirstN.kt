package module1.chapter5_collections

/**Unit 13: Get Part - 1. Take First N
Write a function that takes a list and an integer n, and returns the first n elements of the list.*/

fun main() {
    val numbers = listOf(1, 20, 43, 42, null, 10, 23, 19, 14, 13, 100, -4, 12, 69, 44, 9, 7)
    val firstThreeElements = firstNElements(numbers, 3)
    println(firstThreeElements)

    val firstFiveElements = firstNElements(numbers, 5)
    println(firstFiveElements)
}

fun <T> firstNElements(list: List<T>, n: Int): List<T> {
    return list.take(n)
}


