//File touched for update flag
package module1.chapter5_collections

/** 2. Frequency Counter
 * Create a class called FrequencyCounter.
 * Write a function that takes a list of words and returns a map with each word and the number of times it appears in the list.
 */

class FrequencyCounter {
    fun countFrequencies(words: List<String>): Map<String, Int> {
        return words.groupingBy { it }.eachCount()
    }
}

fun main() {
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple")
    val counter = FrequencyCounter()
    val frequencies = counter.countFrequencies(words)

    println(frequencies) // Output: {apple=3, banana=2, orange=1}
}
