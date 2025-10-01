package messages.sms

class Message(val text: String)

fun sendSMS(message: Message, mobileNumber: Int)    {
    println("Message '${message.text}' has been sent to $mobileNumber")
}