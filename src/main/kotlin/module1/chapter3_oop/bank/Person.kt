package bank

/*Task 5.2: Family Members**
Create a class `Person` with:
- A protected property `lastName` (String).
- A public property `firstName` (String).
- A public function `showFullName()` that prints the full name.
Then, create a class `Child` that inherits from `Person` and prints the last name using a function.
Try to access `lastName` from outside both classes. */


open class Person(inputFirstName: String, inputLastName: String) {
    var firstName: String = inputFirstName
    protected var lastName: String = inputLastName

    fun showFullName()  {
        println("Customer's full name is ${firstName} ${lastName}")
    }
}

class Child(firstName: String, lastName: String) : Person(firstName, lastName) {
    fun showLastName() {
        println("Child's last name is $lastName")
    }
}
