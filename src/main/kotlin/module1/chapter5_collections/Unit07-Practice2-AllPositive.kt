package module1.chapter5_collections

/**Unit 7: Checking Elements - 2. All Positive
Create a function that checks if all elements in a list of integers are positive.*/

fun main()  {
    val numbers1 = listOf(1, 3, 7, 15, 31)
    val numbers2 = listOf(1, -3, 7, 0, 31)
    val numbers3 = listOf(1, 3, 7, 0, 31)

    println("The list of numbers ${numbers1.toList()} are all greater than 0: ${allPositive(numbers1)}") // true
    println("The list of numbers ${numbers2.toList()} are all greater than 0: ${allPositive(numbers2)}")// false
    println("The list of numbers ${numbers3.toList()} are all greater than 0: ${allPositive(numbers3)}")// false
}

fun allPositive(list: List<Int>): Boolean {
    for (num in list) {
        if (num <= 0) {
            return false // return false if any element is 0 or negative
        }
    }
    return true // all elements are positive
}