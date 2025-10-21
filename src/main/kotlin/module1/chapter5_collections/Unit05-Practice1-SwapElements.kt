package module1.chapter5_collections

/**Unit 5: Array - 1. Swap Elements
Write a function that swaps the first and last elements of an array of strings.*/

fun main()  {
    val words = arrayOf("Tom", "Bob", "Mike", "Alice")
    println("Before swap: ${words.toList()}")

    swapFirstAndLast(words)

    println("After swap:  ${words.toList()}")
}

fun swapFirstAndLast(array: Array<String>) {
    if (array.size < 2) return  // Check if array contains less than 2 elements

    val temp = array[0] // Store first element in array to temporary variable
    array[0] = array[array.size - 1] // Store element at last index position to first position in array
    array[array.size - 1] = temp // Set last index position of array to previous first element stored in temp
}