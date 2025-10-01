package module1.chapter2_functional_programming

fun main()  {
    println("Unit 6 - Task 1")
    val message: () -> Unit = ::greet
    message()

    println("Unit 6 - Task 2")
    var operation: (Int,Int) -> Int = ::multiplyValues
    val result1 = operation(4,5)
    println("4 times 5 = $result1")

    println("Unit 6 - Task 3")
    operation = ::subtractValues
    val result2 = operation(4, 5)
    println("4 minus 5 = $result2")

    //@artyom: Why does the editor mark the 'operation' variable in 'operation = ::subtract' with the comment
    //"assigned value never used" when it so very clearly is used in the next line?

    println("Unit 7 - Task 1")
    fun operate(n1: Int, n2: Int, op: (Int, Int) -> Int): Int  {
       return op(n1, n2)
    }

    println(operate(5,3, ::addValues))
    println(operate(5,3, ::subtractValues))
    println(operate(5,3, ::multiplyValues))

    println("Unit 7 - Task 2")
    val morning = chooseGreeting(true)
    val night = chooseGreeting(false)
    morning()
    night()

    println("Unit 7 - Task 3")
    repeatAction { println("Repeating...") }

    println("Unit 8 - Task 1")
    val sum = fun(x: Int, y: Int): Int = x + y
    println(sum(7,3)) //7 + 3 = 10

    println("Unit 8 - Task 2")
    println(doMath(6 , 6,fun(x: Int, y: Int): Int = x * y))
    println(doMath(8 , 8,fun(x: Int, y: Int): Int = x * y))

    println("Unit 8 - Task 3")
    val result = getAnonymous(4,5)
    println(result(4,5)) // 4 - 5 = 1

    println("Unit 9 - Task 1")
    val hello = {println("Hello from Lambda!")}
    hello()

    println("Unit 9 - Task 2")
    val stringToPrint = {message: String -> println(message.uppercase())}
    stringToPrint("kotlin")

    println("Unit 9 - Task 3")
    val add = applyOperation(6, 5) { x, y -> x + y }
    val subtract = applyOperation(11, 3) { x, y -> x - y }
    val multiply = applyOperation(8, 8) { x, y -> x * y }

    println("Add: $add")
    println("Subtract: $subtract")
    println("Multiply: $multiply")


// Write a function called applyOperation that takes two Ints and a lambda, and returns the result.
// Use this function to add, subtract, and multiply numbers with different lambdas.
}

//Unit 6 - Task 1 - Function Type
// Create a function called greet that prints "Hello!" and assign it to a variable. Call the function using the variable.
fun greet(): Unit  {
    println("Hello!")
}

//Unit 6 - Task 2 - Function Type
// Define a function called multiply that takes two Int parameters and returns their product.
// Assign it to a variable of function type and call it with values 4 and 5.
fun multiplyValues(a: Int,b: Int): Int    {
    return a * b
}

//Unit 6 - Task 3 - Function Type
// Write a function called subtract that takes two Int parameters and returns their difference. Create a variable
// that can hold either multiply or subtract, and switch between them. Show the result for both operations.
fun subtractValues(a: Int, b: Int): Int   {
    return a - b
}

//Unit 7 - Task 1 - High Order Functions
// Write a function called operate that takes two Int numbers and a function as parameters. The function parameter
// should take two Ints and return an Int. Use operate to add, subtract, and multiply numbers.

fun addValues(a: Int, b: Int): Int {
    return a + b
}

//Unit 7 - Task 2 - High Order Functions
// Create a function called chooseGreeting that returns a function. If you pass in true, it should return a function
// that prints "Good Morning". If you pass in false, it should return a function that prints "Good Night".
// Show how to call the returned function.

fun chooseGreeting(isItMorning: Boolean): () -> Unit {
    return if (isItMorning == true) {
        fun() { println("Good Morning") }
    }
    else {
       fun() { println("Good Night") }
    }
}

//Unit 7 - Task 3 - High Order Functions
// Write a function called repeatAction that takes a function with no parameters and repeats it 3 times.

fun repeatAction(doSomething: () -> Unit)   {
    for (r in 1 .. 3) {
        doSomething()
    }
}

//Unit 8 - Task 1 - Anonymous Functions
// Create an anonymous function that adds two Int numbers. Assign it to a variable and call it with 7 and 3.
//See main() for code

//Unit 8 - Task 2 - Anonymous Functions
// Pass an anonymous function to a function called doMath that multiplies two numbers.
// doMath should take two Ints and a function, and return the result.

fun doMath(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

//Unit 8 - Task 3 - Anonymous Functions
// Write a function called getAnonymous that returns an anonymous function which subtracts one number from another.
fun getAnonymous(a: Int, b: Int): (Int, Int) -> Int   {
    return fun(a: Int, b: Int): Int = a - b
}

//Unit 9 - Task 1 - Lambda Expressions
// Create a lambda that prints "Hello from Lambda!" and call it.
//See main() for code

//Unit 9 - Task 2 - Lambda Expressions
// Write a lambda that takes a String and prints it in upper case. Call the lambda with the word "kotlin".
//See main() for code

//Unit 9 - Task 3 - Lambda Expressions
// Write a function called applyOperation that takes two Ints and a lambda, and returns the result.
// Use this function to add, subtract, and multiply numbers with different lambdas.

fun applyOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}