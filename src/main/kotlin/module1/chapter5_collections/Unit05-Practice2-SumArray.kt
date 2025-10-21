package module1.chapter5_collections

/**Unit 5: Array - 2. Sum Array
Create a function that takes an array of integers and returns the sum of all elements.*/


fun main()  {
    val numbers = arrayOf(1,3,7,15,31,63)
    println("Sum of ${numbers.toList()} is ${sumOfArray(numbers)}")

}

fun sumOfArray(array: Array<Int>): Int {
    var sum = 0
    for (num in array) {
        sum += num
    }
    return sum
}