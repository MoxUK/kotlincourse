package library

/** ## Task 2: "Build a Simple Library System"
Make a tiny library system using classes and packages.
- Create a package called `library`.
- Make a class called `Book` with properties for `title` and `author` (set them in the constructor).
- Add a computed property `description` which returns a string like `"Book: {title} by {author}"`.
- Add a setter for `title` so that empty titles are not allowed.
- In another file, import the `Book` class, create two books, and print their descriptions.
- Try to set one book's title to an empty string and show that the title does not change.
---*/

fun main()  {
    val book1:Book = Book("Zen and the Art of Motorcycle Maintenance","Lord Ives")
    val book2:Book = Book("Hamlet", "William Shakespear")
    println(book1.description)
    println(book2.description)
    book1.title = ""
    println(book1.title)
    println(book1.description)
    book1.title = "Changed title"
    println(book1.description)
    println(book1.title)

}