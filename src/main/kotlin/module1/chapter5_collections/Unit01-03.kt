package module1.chapter5_collections

fun main()  {
    val numbers: Array<Int?> = arrayOf(1, 2, 3, 4, 5)
    val people: Array<String> = arrayOf("Tom", "Sam", "Kate")

    val first = people.get(0)
    val second = people[1]
    val outOfRangePerson = people.getOrNull(3)
    val orElsePerson = people.getOrElse(3) {"Invalid Index $it"}
    println(first)
    println(second)
    println(outOfRangePerson)
    println(orElsePerson)

    people.set(0, "Thomas")
    people[1] = "Robert"
    println(people[0])
    println(people[1])

    val students =arrayOfNulls<String>(3)
    println(students.toList())

    var i = 1
    val numbers2 = Array(3) {i++ * 2}
    println(numbers2.toList())

    /**
     *  size
     * lastIndex (size - 1)
     * indices
     */
    val users: Array<String> = arrayOf("Tom", "Sam", "Kate")
    println("Size: ${users.size}")
    println("Last Index: ${users.lastIndex}")
    println("Indices: ${users.indices}")

    for (user in users) {
        println("Hello $user")
    }

    for (i in 0 .. users.lastIndex) {
    println("${i+1} - ${users[i]}")
    }

    val numberOfUsers = arrayOf(1,2,3,4,5)
    for (i in 0 .. numberOfUsers.lastIndex) {
        numberOfUsers[i] = numberOfUsers[i] * numberOfUsers[i]
    }

    var n = 0
    while (n in users.indices)  {
        println("User ${users[n]}")
        n++
    }

    users.forEach { u -> println(u) }
    users.forEachIndexed { index, user -> println("$index. $user") }

}