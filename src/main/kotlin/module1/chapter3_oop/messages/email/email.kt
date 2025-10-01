package messages.email

class Message(val text: String)

fun sendEmail(message: Message, address: String)    {
    println("Message '${message.text}' has been sent to $address")
}