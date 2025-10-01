package books

class Book (val _title: String,
    val _author: String) {

    constructor(title: String) : this(title, "Unknown")

    init {
        println("Book Created: '$_title' by $_author")
    }

    fun bookInfo()   {
        println("Book Info: '$_title' written by $_author")
    }
}