package medical.entities

/*Create a class DoctorAccount that inherits from MedicalAccount and overrides the notify() function
to print "Doctor alert for {username}".*/

class DoctorAccount (
    username: String) : MedicalAccount(username)    {
        override fun printNotification() {
            println("Doctor alert for $username")
        }
}