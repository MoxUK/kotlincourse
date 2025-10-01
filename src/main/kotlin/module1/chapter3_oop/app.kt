package module1.chapter3_oop
import messages.email.Message
import messages.email.sendEmail
import messages.sms.sendSMS
import entity.Person

var age: Int = 18

    // get() = field <-- this is valid syntax and does the same as get() {return field}
    get()   {
        println("Call getter")
        return field
    }

    set(value)  {
        println("Call setter")
        if (value in 1 .. 99) {
            field = value // field is a hidden place where Kotlin keeps value of a property (e.g. name, age)
        }
    }

fun main()  {
    val person = Person( "Lewis",40)

    println(person.name)
    println(person.age)

    val myMessage = Message("Hello World!")
    sendEmail(myMessage, "homer@simpsons.com")

    val mySmsMessage = messages.sms.Message("Hello mobile World")
    sendSMS(mySmsMessage, 88776655)

    println(age)
    age = 45 //age in valid range
    println(age)
    age = 101 //age NOT in valid range
    println(age)
}
