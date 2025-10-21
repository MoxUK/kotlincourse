package module1.chapter5_collections

/**Unit 9: Grouping - 1. Group by First Letter
Write a function that groups a list of words by their first letter and returns a map.*/

fun main() {
    val words = listOf("laptop", "monitor", "iphone", "mouse", "keyboard", "desk", "chair", "lamp", "cup")
    val grouped = groupByFirstLetter(words)

    // Print the lists one by one, where Keys → first letter (char) and Values → lists of words starting with that letter
    for ((letter, wordList) in grouped) {
        println("$letter: $wordList")
    }
}

fun groupByFirstLetter(list: List<String>): Map<Char, List<String>> {
    // Get the first character of each word using it.first() and use groupBy to collect all
    // words with the same first letter into a list, then return the list
    return list.groupBy { it.first() }
}