package module1.chapter3_oop

fun main()  {
    val numbers = listOf(1, 2, 3, 4)
    val people = listOf("Tom", "Sam", "Bob")
    println(numbers)
    println(people)

    for (person in people)  {
        println("Hello $person")
    }

    val first = people.get(0)
    val second = people[1]  // Use index position direct instead of 'get'
    val outOfRange = people.getOrNull(5) // fails gracefully if index > length
    val outOfRange2 = people.getOrElse(7)   {println ("Out of Range")} //assigns else value/action if index > length

    val subPeople = people.subList(1, 2) // Use subList to get a range from the list
    println(subPeople)

    val numbers2 = mutableListOf(5, 6, 7)
    println(numbers2)
    numbers2.add(4)
    println(numbers2)
    numbers2.add(0,100)
    println(numbers2)
    numbers2.remove(6) //remove element matching value (NOT index)
    println(numbers2)
    numbers2.remove(42)
    println(numbers2)



}