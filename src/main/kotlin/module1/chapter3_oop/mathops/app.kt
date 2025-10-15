/** file touched for update flag */
/*Task 3.2:
In another file, import your `add` function from `mathops` and use it to add two numbers. Print the result.*/

package mathops
import mathops.addFunction // import call is redundant as app.kt is sitting inside the mathops package

fun main() {
    println(addFunction(2,2))
}