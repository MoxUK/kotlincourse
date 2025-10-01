package university

import university.entities.StudentAccount
import university.entities.UniversityAccount

/**
Unit 6: Inheritance Practice Task
Task 1: University Accounts

Imagine you are building a system for a university.
Create a base class UniversityAccount with properties: username (String) and email (String).
Add a function showInfo() that prints the username and email.
Create a class StudentAccount that inherits from UniversityAccount and adds a property studentId (Int).
In StudentAccount, add a function showStudentInfo() that prints all account info plus the student ID.
 */

fun main()  {
    val uniAccount1 = UniversityAccount("Mark Zuckerberg", "creepyscumbag@harvard.edu")
    uniAccount1.showInfo()

    val studentAccount1 = StudentAccount("Mark Zuckerberg", "creepyscumbag@harvard.edu", 666)
    studentAccount1.showStudentInfo()
}


