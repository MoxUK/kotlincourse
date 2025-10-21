package module1.chapter5_collections.sorting

fun main() {
    //sorted()
    //sortedDescending()

    val people = listOf("Tom", "Mike", "Bob", "Sam", "Aaron", "Alice")
    val numbers = listOf(3, 5, 2, -4, -6, 9, 1, 4)

    //Ascending order
    val sortedPeople = people.sorted()
    val sortedNumbers = numbers.sorted()
    println(sortedPeople)
    println(sortedNumbers)

    //Descending order
    val sortedDescPeople = people.sortedDescending()
    val sortedDescNumbers = numbers.sortedDescending()
    println(sortedDescPeople)
    println(sortedDescNumbers)

    val users = listOf(
        User("C", 41),
        User("A", 37),
        User("D", 25),
        User("B", 51)
    )

    val sortedUsers = users.sorted()
    println(sortedUsers)
    val sortedUsersDesc = users.sortedDescending()
    println(sortedUsersDesc)


    val students = listOf(
        Student("CStudent", 41),
        Student("AStudent", 37),
        Student("DStudent", 25),
        Student("BStudent", 51)
    )

    val sortedStudents = students.sortedWith(studentByAgeAsc)
    println("\nStudents Ascending By Age:" + sortedStudents)

    val sortedStudentsDsc = students.sortedWith(studentByAgeDsc)
    println("Students Descending By Age:" + sortedStudentsDsc)

    val sortedStudentsName = students.sortedWith(studentByName)
    println("Students Sorted By Name:" + sortedStudentsName)

    //alternative simple method

    println("\nSingle Line Sort:" + students.sortedBy {it.age})
    println("\nPrint numbers in reverse order:" + numbers.reversed())
    println("\nPrint numbers in shuffled order:" + numbers.shuffled())

}

val studentByAgeAsc = Comparator{s1: Student, s2: Student -> s1.age - s2.age} //-1 0 1
val studentByAgeDsc = Comparator{s1: Student, s2: Student -> s2.age - s1.age} // 1 0 -1
val studentByName = Comparator{s1: Student, s2: Student -> s1.name.compareTo(s2.name) }


class Student(val name: String, val age: Int){
    fun compareTo(other: User): Int {
        return name.compareTo(other.name)
    }
    override fun toString(): String {
        return "$name ($age)"
    }
}

class User (val name: String, val age: Int): Comparable<User> {
    override fun compareTo(other: User): Int {
        return name.compareTo(other.name)
    }
    override fun toString(): String {
        return "$name ($age)"
    }
}