package module1.chapter5_collections

/**Unit 14: Get Individual Elements - 2. Get Random Element
Create a function that returns a random element from a list, or null if the list is empty.*/

fun main() {
    val listOfNumbers = listOf(1, 2, 3, 4, 5)
    val randomNumber = getRandomElement(listOfNumbers)
    println(randomNumber)

    val emptyList = listOf<Int>()
    println(getRandomElement(emptyList)) // null

    val listOfStrings = listOf("laptop", "monitor", "iphone", "mouse", "keyboard",
        "desk", "chair", "lamp", "cup")
    val randomString = getRandomElement(listOfStrings)
    println(randomString)
}

fun <T> getRandomElement(list: List<T>): T? {
    return list.randomOrNull()
}
