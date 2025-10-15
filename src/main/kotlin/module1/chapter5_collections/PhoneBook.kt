//File touched for update flag
package module1.chapter5_collections

/** Map Tasks
 * 1. Phone Book
 * Create a class called PhoneBook.
 * Add a function to add a contact (name and phone number) to the phone book (use a map).
 * Also, add a function to find a phone number by name.
 */

class PhoneBook {
    //Use mutableMapOf<String, String>() to store names and numbers.
    private val contacts = mutableMapOf<String, String>()

    //addContact inserts or updates a contact.
    fun addContact(name: String, phoneNumber: String) {
        contacts[name] = phoneNumber
    }

    //findPhoneNumber retrieves the number by name, returning null if not found.
    fun findPhoneNumber(name: String): String? {
        return contacts[name]
    }
}

fun main() {
    val phoneBook = PhoneBook()
    phoneBook.addContact("Alice", "123-456-789")
    phoneBook.addContact("Bob", "987-654-321")

    println(phoneBook.findPhoneNumber("Alice")) // Output: 123-456-789
    println(phoneBook.findPhoneNumber("Charlie")) // Output: null (not found)
}
