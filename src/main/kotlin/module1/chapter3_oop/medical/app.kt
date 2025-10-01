package medical

import medical.entities.DoctorAccount
import medical.entities.MedicalAccount
import medical.entities.PatientAccount

/**
Unit 7: Overriding Practice Task
Task 1: Medical Account Notifications
Suppose you are working on a medical app.
Create a base class MedicalAccount with a property username (String) and a function notify()
that prints "General medical notification for {username}".
Create a class DoctorAccount that inherits from MedicalAccount and overrides the notify() function
to print "Doctor alert for {username}".
Create a class PatientAccount that also inherits from MedicalAccount and overrides the notify() function to
print "Patient reminder for {username}".
Create objects of each type and call their notify() function to see the different messages.
 */

fun main()  {
    val medicalAcc1 = MedicalAccount("Generic user")
    medicalAcc1.printNotification()

    val doctorAcc1 = DoctorAccount("Doctor ImmerGut")
    doctorAcc1.printNotification()

    val patientAcc1 = PatientAccount("Asylum Inmate #1")
    patientAcc1.printNotification()

}