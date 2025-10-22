package module1.chapter5_collections

/**Unit 11: Aggregate Operations - 2. Average Score
Create a function that takes a list of scores and returns the average score.*/

fun main() {
    val scores = listOf(1, 20, 43, 42, null, 10, 23, 19, 14, 13, 100, -4, 12, 69, 44, 9, 7)
    val avg = averageScore(scores.filterNotNull()) //added filterNotNull to handle lists with Int and Null
    println("The average score is $avg")
}

fun averageScore(list: List<Int>): Double {
    return list.average()
}
