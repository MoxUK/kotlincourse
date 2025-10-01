package university.entities
/*
Create a class StudentAccount that inherits from UniversityAccount and adds a property studentId (Int).
In StudentAccount, add a function showStudentInfo() that prints all account info plus the student ID.
 */


class StudentAccount (
    username: String,
    email: String,
    val studentId: Int) : UniversityAccount(username, email)    {
    fun showStudentInfo()   {
        println("User $username has the email address $email and the student ID# $studentId")
    }
}