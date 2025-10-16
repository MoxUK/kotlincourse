package module1.chapter5_collections

/**
 * 1. Student Grades
 * Create a class called Student.
 * Each student has a name and a list of grades (Int).
 * Write a function inside the class that calculates the average grade of the student.
 */

class Student(
    val name: String,
    val grades: List<Int>
) {
    fun averageGrade(): Double {
        return if (grades.isNotEmpty()) {
            grades.average()
        } else {
            0.0
        }
    }
}

fun main() {
    val student = Student("Alice", listOf(85, 90, 78, 92, 100, 5, 24))
    println("${student.name}'s average grade: ${student.averageGrade()}")
}