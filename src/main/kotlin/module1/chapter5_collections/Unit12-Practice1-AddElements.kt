package module1.chapter5_collections

/**Unit 12: Add, Subtract, Union - 1. Add Elements
Write a function that adds two lists together and returns the combined list.*/

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)
    val combinedInt = combineLists(list1, list2)
    println(combinedInt)

    val list3 = listOf("laptop", "monitor", "iphone", "mouse")
    val list4 = listOf("keyboard", "desk", "chair", "lamp", "cup")
    val combinedStrings = combineLists(list3, list4)
    println(combinedStrings)
}

    fun <T> combineLists(list1: List<T>, list2: List<T>): List<T> {
    return list1 + list2
}
