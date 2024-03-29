package com.graphqljava.tutorial.bookDetails

class Book(val id: String, private val name: String, private val pageCount: Int, val authorId: String) {
    companion object {
        private val books = listOf(
            Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            Book("book-2", "Moby Dick", 635, "author-2"),
            Book("book-3", "Interview with the vampire", 371, "author-3")
        )

        fun getById(id: String) = books.firstOrNull { it.id == id }
    }
}
