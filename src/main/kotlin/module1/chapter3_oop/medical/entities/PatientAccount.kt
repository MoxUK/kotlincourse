package medical.entities
/*Create a class PatientAccount that also inherits from MedicalAccount and
overrides the notify() function to print "Patient reminder for {username}".
Create objects of each type and call their notify() function to see the different messages.*/

class PatientAccount  (
    username: String) : MedicalAccount(username)    {
    override fun printNotification() {
        println("Patient reminder for $username")
    }
}