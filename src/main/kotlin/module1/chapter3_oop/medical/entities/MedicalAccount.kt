package medical.entities

/*Create a base class MedicalAccount with a property username (String) and
a function notify() that prints "General medical notification for {username}".*/

open class MedicalAccount (val username: String) {
    open fun printNotification() {
        println("User name on the medical record is $username")
    }
}