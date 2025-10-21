package module1.chapter5_collections



/** Unit 4: Sequence - 1. Even Numbers Sequence
Create a sequence of even numbers from 2 to 20. Print the first 5 numbers.*/

fun main()  {
    println("Unit 4 - Practice Exercise 1:")
    val evenNumbers = mutableListOf<Int>()
    for (number in 1..20) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    for (i in 0 until 5)    {
        print("${evenNumbers[i]}, ")
    }
}
