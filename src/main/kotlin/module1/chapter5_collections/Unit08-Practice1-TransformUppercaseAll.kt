package module1.chapter5_collections

/**Unit 8: Transformations - 1. Uppercase All
Write a function that takes a list of strings and returns a new list with all strings in uppercase.*/

fun main() {
    val listOfWords = listOf("laptop", "monitor", "iphone", "MOUsE", "KEYboard", "desklamp", "chair")
    val upperWords = toUpperCaseList(listOfWords)
    println(upperWords)
}

fun toUpperCaseList(list: List<String>): List<String> {
    return list.map { it.uppercase() }
}