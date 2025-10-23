package module1.chapter5_collections

/**Unit 14: Get Individual Elements - 1. Get by Index Safe
Write a function that returns the element at a given index from a list, or "Not found" if the index is out of bounds.*/

fun main() {
    val listOfStrings = listOf("laptop", "monitor", "iphone", "mouse", "keyboard",
        "desk", "chair", "lamp", "cup")

    println(getElementAtIndexN(listOfStrings, 1)) // laptop
    println(getElementAtIndexN(listOfStrings, 10)) // Not found
}

fun getElementAtIndexN(list: List<String>, index: Int): String {
    if (index >= 0 && index < list.size) {
        return list[index]  // if index is valid, return the element
    } else {
        return "Not found"  // if index is out of bounds
    }
}