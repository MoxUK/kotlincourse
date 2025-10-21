package module1.chapter5_collections.transformation
import module1.chapter5_collections.filtering.Person

fun main()  {
    //Transformation
    //map()
    //flatmap()

    val people = listOf(
        Person("Tom", 19),
        Person("Sam", 20),
        Person("Bob", 21),
        Person("Kate", 23)

    )

    //Example 1 - get names only from list and map to new list "names"
    val names = people.map { it.name }
    println(names)

    //Example 2
    val numbers = listOf(1,2,3,4,5)
    val squared = numbers.map { it * it }
    println(squared)

    //mapIndexed()
    val namesWithIndex = people.mapIndexed { index, person -> "${index}: ${person.name}" }
    println(namesWithIndex)

    val names1 = people.mapNotNull {if (it.name.length !=3) null else it.name}
    println(names1)

    //flatten()
    val personal = listOf(
        listOf("Tom", "Mike", "Sammy", "Bob"),
        listOf("Sam", "Kate"),
        listOf("Tom", "Bill", "Joe")
    )

    println(personal)

    val people1 = personal.flatten()
    println(people1)

    //No need to flatten if two separate lists.
    val peopleList1 = listOf("Tom", "Dick", "Jones")
    val peopleList2 = listOf("Hewie", "Lewie", "Dewie")
    val peopleListFlat = peopleList1 + peopleList2
    println(peopleListFlat)

}