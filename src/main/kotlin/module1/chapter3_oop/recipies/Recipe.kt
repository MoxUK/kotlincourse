/** file touched for update flag */
package recipies

/*Task 5.3: Secret Recipe**
Create a class `Recipe` with:
- An internal property `ingredients` (List of String).
- A public property `name` (String).
- A private function `printIngredients()` that prints all ingredients.
In your main function, print the recipe name and call `printIngredients()`.
Try to access `ingredients` from another file in the same module and from a different module.*/

class Recipe(val name: String) {

    // internal property: accessible within the same module
    internal val ingredients: List<String> = listOf("Flour", "Eggs", "Milk", "Sugar", "Baking Powder")

    // private function: only accessible inside the class
    private fun printIngredients() {
        println("Ingredients for $name:")
        for (ingredient in ingredients) {
            println("- $ingredient")
        }
    }

    // public function to access the private printIngredients() from outside
    fun showRecipe() {
        println("Recipe: $name")
        printIngredients()
    }
}

fun main() {
    val pancakeRecipe = Recipe("Muffins")
    pancakeRecipe.showRecipe()
// cannot call pancakeRecipe.printIngredients() directly - it's private
}