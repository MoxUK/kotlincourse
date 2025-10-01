package module1.chapter5_collections

fun main()  {
    val numbers = listOf(1, 2, 3, 4)
    val people = listOf("Tom", "Sam", "Bob", "Alex", "Bob")
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

    val a: Iterable<Int>
    val b: MutableIterable<Int>

    val numbersSet = setOf(5,6,7) //list must contant unique val; setOF(5,6,7,6) would still yield (5,6,7)
    val peopleSet = setOf("Tom","Sam","Bob","Alex","Bob")
    println(numbersSet)
    // println(peopleSet)
    // for (p in peopleSet) println(p)
    // peopleSet.forEach { person -> println(person) }

    val uniquePeople = people.toSet()
    println(uniquePeople)

    println("---------------------------")

    val people2 = setOf("Tom", "Sam", "Alex", "Bob", "Alice")
    val employee = listOf("Tom", "Sam", "Kate", "Mike")


    val all = people2.union(employee) //same as: people2 union employee
    println(all)
    val common = people2.intersect(employee) //same as: people2 intersect employee
    println(common)
    val different = employee.subtract(people2) //same as: employee subtract people2
    println(different)

    //Set
    val numbersSet1: HashSet<Int> = hashSetOf(5, 6, 7)
    val numbersSet2: LinkedHashSet<Int> = linkedSetOf(1, 2, 3)
    val numbersSet3: MutableSet<Int> = mutableSetOf(1,2,3)

    //Map
    val students: Map<Int, String> = mapOf(101 to "Tom", 102 to "Sam", 91 to "Bob") //Map<Int, String>
    println(students)

    for (student in students)   {
        val key = student.key
        val value = student.value
        println("$key, $value")
    }

    val dictionary = mapOf("red" to "czerwony", "blue" to "nibeski", "green" to "zielony")
    val blue = dictionary.get("blue")
    //val blue = dictionary.["blue"]
    println(blue)

    //val yellow = dictionary.["yellow"] //This is null
    //println(yellow)

    val yellow = dictionary.getOrDefault("yellow", "Not found!")
    println(yellow)
    val orange = dictionary.getOrElse("orange") {"Not found either!"}
    println(orange)

    println("Keys of dictionary: ${dictionary.keys}")
    println("Values of dictionary: ${dictionary.values}")

    val workers = mutableMapOf(1 to "Tom", 2 to "Sam", 3 to "Bob")
    val hashmap = hashMapOf("a" to "A", "b" to "B", "c" to "C")

    workers.put(5,"Peter")
    workers[4] = "Alice"

    println(workers)

    workers.put(5, "Helmut")
    println(workers)

    workers.remove(1)
    println(workers)


    val rating: MutableMap<Int, String?> = mutableMapOf(1 to "3.0", 2 to "4.5", 3 to "2.5", 4 to "", 5 to "")
    println(rating)
    val valueOfRatingValues: List<Double> = rating.values.mapNotNull {
            str -> str?.takeIf {it.isNotBlank() }?.toDoubleOrNull()
    }
    println(valueOfRatingValues)
    println(valueOfRatingValues.average())
}