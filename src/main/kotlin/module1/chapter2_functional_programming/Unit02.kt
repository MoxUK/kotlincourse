package module1.chapter2_functional_programming

//Variable numbers of parameters (vararg)

fun main()  {
    printStrings("Tom", "Bob", "Sam")
    printStrings("Kotlin","Java","JavaScript","C#","Python","etc")
    val result = sum(1,2,3,4,5)
    println(result)

    printUserGroup("Match 101", "Tom", "Bob", "Sam", count = 1)
}

fun printStrings(vararg strings: String)   {
    for (str in strings)    {
        println(str)
    }
}

fun sum(vararg numbers: Int) : Int  {
    var result = 0
    for (number in numbers) {
        result = result + number
    }
    return result
}

fun printUserGroup(group: String, vararg users: String, count: Int) {
    println("Group: $group")
    println("Count: $count")
    for (user in users) {
        println(user)
    }
}