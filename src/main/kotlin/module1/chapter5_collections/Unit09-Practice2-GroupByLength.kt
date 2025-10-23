package module1.chapter5_collections

/**Unit 9: Grouping - 2. Group by Length
Create a function that takes a list of words and groups them by length.*/


fun main() {
    val words = listOf("laptop", "monitor", "iphone", "mouse", "keyboard", "desk", "chair", "lamp", "chair")
    val grouped = groupByLength(words)

    // Print the lists one by one, where Keys → word lengths (Int) and Values → lists of words with that length
    for ((length, wordList) in grouped) {
        println("Words of length $length: $wordList")}
}

fun groupByLength(list: List<String>): Map<Int, List<String>> {
    return list.groupBy { it.length } //Loops through each word in the list using length as key, then collects words with same length into list.
}