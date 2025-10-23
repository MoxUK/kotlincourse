package module1.chapter5_collections

/**Unit 10: Sorting - 1. Sort By Length
Write a function that takes a list of strings and returns a new list sorted by string length.*/

fun main() {
    val words = listOf("laptop", "monitor", "iphone", "mouse", "keyboard", "desk", "chair", "lamp", "cup")
    val sorted = sortByLength(words)
    println(sorted)
}

fun sortByLength(list: List<String>): List<String> {
    return list.sortedBy { it.length } //Looks at length of each string. Returns new list sorted from shortest to longest.
}
