package dataclasses

fun main()  {
    val student = Student("Tom", 24)
    val person = student.copy("Alice")

    val (username, userage) = student
    println("Name: $username, Age: $userage")


    println(student)
    println(person)
}

/**
 * equals()
 * hashCode()
 * toString()
 * copy()
 *
 */

data class Student(
    val name: String,
    val age: Int
){
    val status: String = "Valid"
}