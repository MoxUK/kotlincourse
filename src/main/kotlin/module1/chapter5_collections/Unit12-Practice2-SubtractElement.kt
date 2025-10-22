package module1.chapter5_collections

/**Unit 12: Add, Subtract, Union - 2. Subtract Elements
Create a function that takes two lists and returns a list with elements from the first list that are not in the second.*/

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(2, 4, 6)
    val resultInt = difference(list1, list2)
    println(resultInt)

    val list3 = listOf("laptop", "monitor", "iphone", "mouse")
    val list4 = listOf("monitor", "iphone", "keyboard", "desk", "chair", "lamp", "cup")
    val resultStrings = difference(list3, list4)
    println(resultStrings)
}

fun <T> difference(list1: List<T>, list2: List<T>): List<T> {
    return list1 - list2
}

