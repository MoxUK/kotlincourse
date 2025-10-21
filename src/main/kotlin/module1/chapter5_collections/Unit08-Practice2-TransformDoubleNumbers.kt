package module1.chapter5_collections

/**Unit 8: Transformations - 2. Double Numbers
Create a function that takes a list of integers and returns a list of their doubles.*/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubledNumbers = doubleList(numbers)
    println(doubledNumbers)
}

fun doubleList(list: List<Int>): List<Int> {
    return list.map { it * 2 }
}