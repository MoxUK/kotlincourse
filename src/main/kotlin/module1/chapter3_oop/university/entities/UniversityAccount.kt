package university.entities
/*
Create a base class UniversityAccount with properties: username (String) and email (String).
Add a function showInfo() that prints the username and email.
 */

open class UniversityAccount (val username: String, val email: String) {
    open fun showInfo() {
        println("User $username has the email address $email")
    }
}