//File touched for update flag
package module1.chapter5_collections

/** Set Tasks
 * 1. Unique Names
 * Create a class called NameCollector.
 * Add a function that takes a list of names (String) and returns a set with only unique names.
 */



class NameCollector {
    fun collectUniqueNames(names: List<String>): Set<String> {
        return names.toSet()  // converts list to set, automatically removes duplicates
    }
}

fun main() {
    // initialise variable
    val nameCollector = NameCollector()
    // create list of names
    val names = listOf("Alice", "Bob", "Alice", "Charlie", "Bob")
    // get a set of names by creating a class object NomeCollector calling the collectUniqueNames func then print
    val uniqueNames = nameCollector.collectUniqueNames(names)
    println("Unique names: $uniqueNames")
}