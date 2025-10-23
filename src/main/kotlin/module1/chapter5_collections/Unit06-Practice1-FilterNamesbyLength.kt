package module1.chapter5_collections

/**Unit 6: Filtering Collections - 1. Filter Names by Length
Write a function that takes a list of names and returns only those names that have more than 4 letters.*/

fun main()  {
    var listOfPeople = listOf("Tom", "Sam", "Mike", "Bob", "Alice", "Roger",
        "Richard", "Hewie", "Lewie", "Dewie", "Tim")
    listOfPeople = listOfPeople.filter { it.length > 3 }
    println(listOfPeople)
}
