package entity

import social.User

fun main()  {
    val student1 = Student("Alice", 15)
    println("Name: ${student1.name} is ${student1.age} years old and ${if (student1.isAdult) "" else "NOT "}an adult")
    println("${student1.name} is ${if (student1.validStudent) "" else "NOT "}a valid student")
    println("\n")

    val student2 = Student("", 18)
    println("Name: ${student2.name} is ${student2.age} years old and ${if (student2.isAdult) "" else "NOT "}an adult")
    println("${student2.name} is ${if (student2.validStudent) "" else "NOT "}a valid student")
    println("\n")

    val student3 = Student("Walther", 3)
    println("Name: ${student3.name} is ${student3.age} years old and ${if (student3.isAdult) "" else "NOT "}an adult")
    println("${student3.name} is ${if (student3.validStudent) "" else "NOT "}a valid student")
}