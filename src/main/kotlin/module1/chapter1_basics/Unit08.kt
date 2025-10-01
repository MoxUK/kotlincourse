package module1.chapter1_basics// Introduction to Arrays

fun main()  {
    // position
    // 0    1   2   3   4
    // values
    // 5    2   1   -3  100
    unit8example1()
    unit8example2()
    unit8example3()
    unit8example4()
    unit8example5()
    }

//Creating Array
fun unit8example1() {
    val numbers: Array<Int> = arrayOf(5, 2, 1, -3, 100)
    val numbersDouble: Array<Double> = arrayOf(5.0, 2.0, 1.0, -3.0, 100.0)
    println("Print numbers in Array")
    for(number in numbers)  {
        print("$number \t")
    }

    val str = arrayOf("a", "bb", "ccc")
    println("\n\nPrint string in Array")
    for(i in str) {
        print("$i \t")
    }
}

//Array with repeated values
fun unit8example2() {
    val zeros = Array(5) {0}
    val squares = Array(5) {i -> i * i}
    println("\n\nPrint Array with repeat value")
    for (zr in zeros) {
        print("$zr \t")
    }
    print("\n")
    for (sq in squares) {
        print("$sq \t")
    }
}


//Accessing and changing elements
fun unit8example3() {
    println("\n\nAccessing and changing elements in array")
    val numbers = arrayOf(10, 20, 30)
    println(numbers[1])
    numbers[2] = 50
    println(numbers[2])
}

//Getting the size of an array
fun unit8example4() {
    println("\nSize of Array")
    val people = arrayOf("Tim", "Bob", "Sam")
    println(people.size)
}

//Check if an element is in array
fun unit8example5() {
    val colors = arrayOf("red", "green", "blue")
    println("\nIs element in array...")
    val check = "yellow" in colors
    println("Is yellow in the array of colors? $check")
    val check2 = "red" in colors
    println("Is red in the array of colors? $check2")
}