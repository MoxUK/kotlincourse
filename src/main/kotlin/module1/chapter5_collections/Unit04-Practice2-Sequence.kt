package module1.chapter5_collections

/**Unit 4: Sequence - 2. Filter Sequence
Write a function using a sequence to filter out numbers less than 10 from a list of integers.*/

fun main()  {
    println("Unit 4 - Practice Exercise 2:")
    val listOfNumbers = listOf(1, 20, 43, 42, 10, 23, 19, 14, 13, 100, -4, 12, 69, 44, 9, 7)
    val filteredList = listOfNumbers.filter { it >= 10 }
    println(filteredList)
}