package module1.chapter1_basics//Updated
class Unit03 {
}

/**
 * Unit 4: If .. else conditionals
 */
fun main()  {
    greet()
    sayBye()
    task2()
    task3()
    task4()
    task5()
    task5v2()
    task5v3()
    task5v4()
    task5v5()
    task5v6()
    task5v7()
}

fun greet() {
    println("Hello from the Greet function")
}

fun sayBye() {
    println("Goodbye")
}

// if statement
fun task2() {
    println("If statement")
    val a = 11
    if (a == 10){
        println("Condition: a is equal 10 is true")
    }
    else {
        println("Condition: a is not equal to 10")
    }
}

//Function with multiple options (else if)
fun task3() {
    println("Function with multiple options (else if")
    val a = 12
    if (a == 10)    {
        println("a is equal to 10")
    } else if (a == 11) {
        println("a is equal to 11")
    } else {
        println("a is unknown")
    }
}

//Return a value from if
fun task4() {
    println("Return a value from if")
    val a = 10
    val b = 20
    val c = if (a > b) a else b
    println(c)
}

// The 'when' expression (switch)
/**
 *
 * when (object) {
 * value1 -> actions1
 * value2 -> action2
 * ...
 * }
 */
fun task5() {
    println("The 'when' expression")
    val isEnabled = true
    when (isEnabled) {
        false -> println("isEnabled is off")
        true -> println("isEnabled is on")
    }
}

fun task5v2()   {
    val a = 30
    when(a) {
        10 -> println("A is 10")
        20 -> println("A is 20")
        else -> println("A is neither 10 nor 20")
    }
}

//Multiple actions for one value
fun task5v3()   {
    println("Multiple actions for one value")
    var a = 11;
    when(a) {
        10 -> {
            println("a = 10")
            a = a + 1
        }
        11 -> {
            println("a = 11")
            a = a + 2
        }
        else -> {
            println("unknown value")
        }
    }
    println(a)
}

//Grouping several values
fun task5v4()   {
    println("Grouping several values")
    val a = 10
    when(a) {
        10, 20 -> println("a is 10 or 20")
        else -> println("Unknown value")
    }
}

//Checking ranges
fun task5v5()   {
    println("Checking Ranges")
    val a = 10
    when(a) {
        in 10 .. 19 -> println("a is between 10 and 19")
        in 20 .. 29 -> println("a us between 20 and 29")
        !in 10 .. 19 -> println("a is NOT between 10 an 19")
    }
}

//Returning value
fun task5v6()   {
    println("Returning value")
    val day = 2
    val dayOfWeek : String = when(day)  {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Unknown"
    }
    val flag = when(day)    {
        1 -> true
        2 -> false
        else -> false
    }
    println(dayOfWeek)
    println(flag)
}

//Dynamic values and calculations
fun task5v7()   {
    println("Dynamic values and calculations")
    val a = 10
    val b = 20
    when(a + b) {
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("Undefined")
    }
}

