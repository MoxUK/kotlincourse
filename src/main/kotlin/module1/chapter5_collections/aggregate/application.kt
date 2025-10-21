package module1.chapter5_collections.aggregate

fun main()  {
    //minOrNull()
    //maxOrNull()

    val people = listOf("Tom", "Mike", "Bob", "Sam", "Aaron", "Alice")
    val numbers = listOf(3, 5, 2, -4, -6, 9, 1, 4)

    println(numbers.minOrNull()) //lowest number.
    println(numbers.maxOrNull()) //highest number.

    println(people.minOrNull()) //name with first letter in list
    println(people.maxOrNull()) //name with last letter in list

    val people1 = listOf(
        Person("Tom", 37),
        Person("Bob", 19),
        Person("Bob", 25)
    )

    val personWithMinAge = people1.minByOrNull { it.age }
    println("Youngest Person in List:" + personWithMinAge)

    //minOfOrNull
    //maxOfOrNull

    val MinAgeInList = people1.minOfOrNull { it.age }
    println("Min Age in List: " + MinAgeInList)

    val MaxAgeInList = people1.maxOfOrNull { it.age }
    println("Max Age In List: " + MaxAgeInList)

    val avgNumberInList = numbers.average()
    println("Average Number In List: " + avgNumberInList)

    val sumOfNumbersInList = numbers.sum()
    println("Sum of Numbers In List: " + sumOfNumbersInList)

    val result = numbers.reduce {a, b -> a * b}
    println(result)

}

class Person(val name: String, val age: Int)    {
    override fun toString(): String {
        return "$name ($age)"
    }
}