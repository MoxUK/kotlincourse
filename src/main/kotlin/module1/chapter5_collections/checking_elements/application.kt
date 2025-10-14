package module1.chapter5_collections.checking_elements

fun main()  {
    //all() - returns true if ALL elements matches predicate
    //any() - returns true if ANY elements matches predicate
    //none() - returns true if NO element matches predicate

    val people =  listOf("Tom", "Sam", "Mike", "Bob", "Alice")

    var result = people.all {it.length == 3} //false because Mike and Alice > 3 chars
    println(result)

    result = people.all {it.length !== 10} //true because there are no names longer than 10 chars
    println(result)

    result = people.any {it.length == 3} //true because there are 3 names out of 5 with a length of 3 chars
    println(result)

    result = people.none {it.length == 6} //true because there are no names on the list that are 6 chars long
    println(result)

    result = people.any {it == "Tom"} //true because there is 1 names matching "Tom"
    println("There is a 'Tom' on the list: $result")

    val buffer: List<String> = listOf()
    println(buffer.any()) //false
    println(buffer.none()) //true

    //contains()
    println(people.contains("Sam")) //true
    println(people.contains("Bill")) //false
    println(people.any { it.equals("sam", ignoreCase = true) }) // true
}