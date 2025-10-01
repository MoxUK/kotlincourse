package module1.chapter1_basics//Loops
/**
 * Basic form:
 * for (variable in sequence)   {
 * // instructions to report
 * }
 */

fun main()  {
    unit6task1()
    unit6task2()
    unit6task3()
    unit6task4()
    unit6task5()
    unit6task6()
}
fun unit6task1()    {
    println("\nFor loop - i in range from 1 to 9")
    for (i in 1..9) {
        println("$i \t")
    }
    println("\nFor loop - var a + 1 run 9 times in loop")
    for (i in 1 .. 9)   {
        var a = i + 1
        println("$a \t")
    }
}

/* Matrix
        (0,0)   (1,0)   (2,0)
        ---------------------
(0,0)    1      2       3
(0,1)    4      5       6
(0,2)    7      8       9

    (0,0) = 1
    (1,0) = 2
    (2,0) = 3
    (0,1) = 4
    (1,1) = 5
    (2,1) = 6
    (0,2) = 7
    (1,2) = 8
    (2,2) = 9

 */

fun unit6task2()    {
    println("\nNested For loops")
    for (i in 1 .. 3)   {
        for (j in 1 .. 3)   {
            print("${i * j} \t")
        }
        println()
    }
}

fun unit6task3()    {
    println("\nArrays")
    val fruits =arrayOf("apple", "banana", "orange")
    for (fruit in fruits){
        println(fruit)
    }
}

// 'while' loop
fun unit6task4()    {
    println("\nWhile loop")
    var i = 10
    while (i >0)    {
        println("While loop: i=$i")
        i--
    }
}

// 'do while' loop
fun unit6task5()    {
    println("\n'Do While' loop")
    var i = -1
    do {
        println("i = $i")
        i--
    } while (i > 0)
}

// 'continue' and 'break' in loops
fun unit6task6()    {
    println("\n'continue' and 'break' in loops")
    //continue - skips the action for the matching condition and continue with the rest
    println("\n'continue'")
    for (i in 1 .. 9)   {
        if (i == 5) {
            continue
        }
        println("i=$i")
    }
    //break stops loop when condition is met.
    println("\n'break'")
    for (i in 1..9){
        if (i == 5) {
            break
        }
        println("i=$i")
    }

}