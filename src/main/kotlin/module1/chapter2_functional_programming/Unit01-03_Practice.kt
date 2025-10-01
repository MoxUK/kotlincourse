package module1.chapter2_functional_programming
fun main()  {
    greet("Soeren")

    displayUser("John Wick", 60)

    showMessage("This is my message that needs to be displayed")

    printNumbers(1,2,4,8,16,32)
    printNumbers(2,4,6,8,10,12)

    concatStrings("This is my first line","and this is the second","and here comes the third")

    addToGroup("Kotlin 101", "Soeren", "Kathrin", "Jeremy", "Facundo","Fie","Carrie")

    val a = multiply (6, 6)
    print("Result is $a \t")

    val b = isEven(6)
    if (b == true) {
        println("\nThe number is even")
    } else {
        println("\nThe number is odd")
    }

    printIfPositive(4)
    printIfPositive(5)
    printIfPositive(-1111)
    printIfPositive(0)
}

/** Unit 1. Functions and Their Parameters */

// Write a function called greet that takes a name (String) as a parameter and prints "Hello, [name]!".
fun greet(name: String) {
    println("Hello, $name, how are you today?")
}

// Write a function called displayUser that takes two parameters:
// a name (String) and an age (Int), and prints "Name: [name], Age: [age]".
fun displayUser(name: String, age: Int) {

    println("Name: $name, Age: $age")
}

// Write a function called showMessage that takes a message (String) and prints it.
// Try calling it with different messages.
fun showMessage(message: String)    {
    println(message)
}

/** Unit 2. Vararg Parameters */

//Write a function called printNumbers that takes a variable number of integers and prints each one on a new line.
fun printNumbers(vararg numbers: Int) {
    println("Printing numbers:")
    for (n in numbers)    {
        println(n)
    }
}

//Write a function called concatStrings that takes a variable number of strings
// and prints them as a single line separated by spaces.
fun concatStrings(vararg randomStrings: String) {
    for (s in randomStrings)    {
        print("$s ")
    }
}

// Write a function called addToGroup that takes a group name (String), any number of user names (String),
// and prints the group name and all users.
fun addToGroup(group: String, vararg users: String) {
    println("\nGroup: $group")
    for (user in users) {
        println(user)
    }
}

/** Unit 3. Returning Results */
//Write a function called multiply that takes two Int parameters and returns their product.
fun multiply(x: Int, y: Int): Int  {
    return x * y
}

//Write a function called isEven that takes an Int and returns true if the number is even, false otherwise.
fun isEven(number: Int): Boolean    {
   return number % 2 == 0
}

//Write a function called printIfPositive that takes an Int and prints the number only if it is positive (use return to exit early).
fun printIfPositive(number: Int) {
    if(number > 0)    {
        println("\nThe number $number is positive")
        return
    }
    if(number == 0) {
        println("\nThe number $number is neither positive nor negative")
        return
    }
    println("\nThe number $number is negative")
}