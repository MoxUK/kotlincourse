package module1.chapter2_functional_programming

fun main()  {
    val value: Int  = 10
    println("The area of a cube with sides of $value units is ${cube(10)}")

    checkAndPrint(10)
    checkAndPrint(0)
    checkAndPrint(-10)

    compareTwo(8,8)
    compareTwo(8,10)
    compareTwo(11,8)
    compareTwo(-1,0)

    show("This is a String")
    show(10)

    println(max(4,3))
    println(max(3.00002,3.00003))

    println(sumInt(1,2))
    println(sumInt(1,2,3))
}


//  Unit 4. Single-Expression and Local Functions
// Write a single-expression function called cube that returns the cube of a given Int.
fun cube(value: Int) = value * value * value

// Write a function called checkAndPrint that takes an Int, defines a local function isValid to check if the number
// is positive, and prints "Valid" or "Invalid".
fun checkAndPrint(value: Int)   {
    fun isValid(checkValue: Int): Boolean {
        if (checkValue > 0) {
            return true
        } else return false
    }
    if (isValid(value)) {
        println("Valid")
    }
    else    {
        println("Invalid")
    }
}

// Write a function compare that takes two Ints and a local function that returns true if both are less than 10.
// Print "Both less than 10" or "Not both less than 10".
fun compareTwo(valueOne: Int, valueTwo: Int)    {
    fun lessThan10(checkValue: Int): Boolean    {
        if (checkValue < 10)    {
            return true
        } else return false
    }
    if (!lessThan10(valueOne) || !lessThan10(valueTwo)) {
        println("Not both less than 10")
        return
    }
    println("Both less than 10")
}

// Unit 5. Function Overloading
// Write two functions with the same name show — one that takes a String and prints it,
// another that takes an Int and prints it.
fun show(input: Int)    {
    println("Print Integer: ${input}")
}

fun show(input: String)    {
    println("Print string: ${input}")
}

// Write two functions called max: one that takes two Ints and returns the larger,
// another that takes two Doubles and returns the larger.
fun max(valueOne: Int,  valueTwo: Int): Int {
    if (valueOne > valueTwo) return valueOne
    if (valueOne < valueTwo) return valueTwo
    else return valueOne
}

fun max(valueOne: Double,  valueTwo: Double): Double {
    if (valueOne > valueTwo) return valueOne
    if (valueOne < valueTwo) return valueTwo
    else return valueOne
}

//Write two functions named sum: one that takes two Ints, and one that takes three Ints, and both return the sum.
fun sumInt(valOne: Int, valTwo: Int) = valOne + valTwo
fun sumInt(valOne: Int, valTwo: Int, valThree: Int) = valOne + valTwo + valThree
