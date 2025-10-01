package module1.chapter1_basics// Ranges

fun main()  {
    val range = 1 .. 5
    val charRange = 'a' .. 'j'
    val stringRange = "a" .. "j"

    for (char in charRange) {
        print("$char \t")
    }

    //Ranges in reverse order
    val rangeRev = 1 .. 5


    unit7task1()
    unit7task2()
    unit7task3()
    unit7task4()
}
//Ranges in reverse order
fun unit7task1()    {
    println("\nUnit 7 Task 1\n")
    val range1 = 1 .. 5
    val range2 = 5 downTo 1

    for (r in range2){
        println("$r \t")
    }

}

//Ranges with step
fun unit7task2()    {
    val range1 = 1 .. 10 step 2
    val range2 = 10 downTo 1 step 3
    println("Print range 1-10 with step 2")
    for (r in range1) {
        println("$r \t")
    }
    println("Print range 10-1 with step 3")
    for (r in range2) {
        println("$r \t")
    }

}

//Ranges without end value
fun unit7task3()    {
    val range1 = 1 until 9
    val range2 = 1 until 9 step 2

    println("Print range 1 until 9")
    for (r in range1) {
        println("$r \t")
    }
    println("Print range 1 until 9 with step 3")
    for (r in range2) {
        println("$r \t")
    }

}

//Checking if a value is in a range
fun unit7task4()    {
    val range = 1 .. 5
    val isInRange: Boolean =  5 in range
    val notInRange: Boolean = -1 in range //can also use '|in range' where |in is 'not in'

    println("5 is in range 1-5: $isInRange")
    println("-1 is in range 1-5: $notInRange")
}

