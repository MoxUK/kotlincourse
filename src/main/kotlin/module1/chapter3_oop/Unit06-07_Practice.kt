package module1.chapter3_oop
/**
Unit 6: Inheritance Practice Task
Task 1: University Accounts

Imagine you are building a system for a university.

Create a base class UniversityAccount with properties: username (String) and email (String).
Add a function showInfo() that prints the username and email.
Create a class StudentAccount that inherits from UniversityAccount and adds a property studentId (Int).
In StudentAccount, add a function showStudentInfo() that prints all account info plus the student ID.
Unit 7: Overriding Practice Task
Task 1: Medical Account Notifications

Suppose you are working on a medical app.

Create a base class MedicalAccount with a property username (String) and a function notification() that prints "General medical notification for {username}".
Create a class DoctorAccount that inherits from MedicalAccount and overrides the notification() function to print "Doctor alert for {username}".
Create a class PatientAccount that also inherits from MedicalAccount and overrides the notification() function to print "Patient reminder for {username}".
Create objects of each type and call their notify() function to see the different messages.
 */