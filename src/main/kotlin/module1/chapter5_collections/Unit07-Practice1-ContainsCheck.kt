package module1.chapter5_collections

/**Unit 7: Checking Elements - 1. Contains Check
Write a function that checks if a given string is present in a list of strings.*/

fun main() {
    val items = listOf("laptop", "monitor", "iphone", "mouse", "keyboard", "desklamp", "chair")

    println(containsString(items, "keyboard")) // true
    println(containsString(items, "fan")) // false
    println(containsString(items, "iPHONE")) // true
}

/**
 * The straight-forward solution is:
 * fun containsString(list: List<String>, str: String) = list.contains(str)
 * However this is not case-insensitive, so an alternative solution is below
*/

fun containsString(list: List<String>, str: String): Boolean {
    return list.any { it.equals(str, ignoreCase = true) }
}

