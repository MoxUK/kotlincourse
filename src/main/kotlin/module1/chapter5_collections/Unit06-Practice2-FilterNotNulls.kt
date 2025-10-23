package module1.chapter5_collections

/** Unit 6: Filtering Collections - 2. Filter Not Nulls
Create a function that takes a list of nullable integers and returns a list of only non-null values.*/

fun main()  {
    val listOfIntegers = listOf(1, null, 3, null, 5, 6, 7, null, 8, 9, 10)
    println(listOfIntegers)
    val filteredListOfIntegers = listOfIntegers.filterNotNull()
    println(filteredListOfIntegers)
}
