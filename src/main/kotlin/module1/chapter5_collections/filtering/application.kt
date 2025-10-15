package module1.chapter5_collections.filtering

import abstractClass.entity.impl.Circle
import abstractClass.entity.impl.Rectangle
import abstractClass.entity.Figure
import kotlin.time.measureTimedValue

fun main()  {
    //filter()
    var people = listOf("Tom", "Sam", "Mike", "Bob", "Alice")
    people = people.filter { it.length == 3 }
    println(people)

    var employees = listOf(
        Person("Tom", 37),
        Person("Bob", 41),
        Person("Sam", 25)
    )

    employees = employees.filter { it.age > 30 }
    println(employees)

    var peopleNot = listOf("Tom", "Sam", "Mike", "Bob", "Alice")
    peopleNot = peopleNot.filterNot { it.length == 3 }
    println(peopleNot)

    val peopleList = listOf(
        Person("Tom", 37), Student("Bob", 19),
        Person("Sam", 30), Student("Mike", 19)
    )

    var students = peopleList.filterIsInstance<Student>()
    println(students)

    var cars = listOf("Car1", null, "car3", null, "Car5")
    println(cars)
    val filteredCars = cars.filterNotNull()
    println(filteredCars)

    val square = Circle("Circle", 2F)
    val rectangle = Rectangle("Rectangle", 1F, 2F)
    val figures: List<Figure> = listOf(square, rectangle)
    val filteredFigure = figures.filterIsInstance<Figure>()
    println(filteredFigure)

}

open class Person(val name: String,
                  val age: Int) {
    override fun toString(): String {
        return "$name : $age"
    }
}

class Student(name: String, age: Int): Person(name, age)