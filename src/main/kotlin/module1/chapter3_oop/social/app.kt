package social

import entity.NewPerson

/**## Task 1: "Make Your Own Social Media User"

Create a simple class called `User` that represents a person on a social media app.

- The class should have properties for the user's name and age.
- Use a constructor to set these values when creating a new user.
- Add a function `sendMessage` in the class that prints a message like: `"Hello from {name}!"`.
- Use a package called `social` for your class.
- Set up a setter for age so that only ages between 13 and 120 are allowed.
- Add a computed property called `isTeen` which returns `true` if age is between 13 and 19.

In your main function:
- Import the class and create two users with different ages and names.
- Call the `sendMessage` function for both users.
- Print if each user is a teen or not.*/

var age: Int = 18

    set(value)  {
        println("Call setter")
        if (value in 1 .. 99) {
            field = value // field is a hidden place where Kotlin keeps value of a property (e.g. name, age)
        }
    }

fun main()  {
    val user1 = User("Alice", 15, "Alice123")

    user1.sendMessage()
    user1.age = 11 //this fails as we can only set an age if between 13 to 120
    println(user1.age)

    println("Is ${user1._nickname} a teen? ${user1.isTeen}")

    user1.age = 17
    println(user1.age)

    println("Is ${user1._nickname} a teen? ${user1.isTeen}")

    val newPerson1 = NewPerson("John", "Wick", 39)
    newPerson1.age = 19




}