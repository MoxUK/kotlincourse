package module1.chapter5_collections

/**Unit 13: Get Part - 2. Chunk List
Create a function that splits a list into chunks of size 2 and returns a list of lists.*/

fun main() {
    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val chunksInt = splitIntoChunks(listOfNumbers)
    println(chunksInt)

    val listOfStrings = listOf("laptop", "monitor", "iphone", "mouse", "keyboard",
    "desk", "chair", "lamp", "cup")
    val chunksStrings = splitIntoChunks(listOfStrings)
    println(chunksStrings)
}

fun <T> splitIntoChunks(list: List<T>): List<List<T>> {
    return list.chunked(2)
}
