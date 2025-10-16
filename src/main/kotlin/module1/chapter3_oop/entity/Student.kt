/*Task 4.1:
Create a class called `Student` with a property `age` (Int).
Add a setter that only allows age values between 5 and 100.*/

package entity

class Student(inputName: String,
              inputAge:Int) {

    var validStudent: Boolean = true
        private set

    var age: Int = inputAge
        set(value) {
            if (value in 5..100) {
                field = value
            } else {
                println("Too young to be a student")
            }
        }
        get() = field

//Task 4.2:
//Add a computed property `isAdult` (Boolean) to the `Student` class. It should return `true`
//if age is 18 or older, else `false`.

    val isAdult: Boolean
        get() = (age >= 18)

//Task 4.3:
//Add a private field `_name` to `Student` and a public property `name` with custom getter and setter.
// The setter should not allow empty names. Try to set an empty name and print the result.

    private var _name: String = name
    var name: String
        get() = _name
        set(value) {
            if (value.isNullOrEmpty()) {
                return
                println("Name cannot be empty")
            } else {
                _name = value
            }
        }

    init {
        if (inputName.isEmpty()) {
            println("This student cannot be created without entering a name")
            _name = "Unknown" //fallback value
            validStudent = false
        } else {
            _name = inputName
        }
        if (inputAge !in 5..100) {
            println("This student cannot be created with the age $inputAge")
            age = inputAge   //fallback value
            validStudent = false
        } else {
            age = inputAge
        }
    }

}
