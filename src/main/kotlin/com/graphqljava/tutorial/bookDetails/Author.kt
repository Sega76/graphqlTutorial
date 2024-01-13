package com.graphqljava.tutorial.bookDetails


class Author(val id: String, private val firstName: String, private val lastName: String) {

    companion object {
        private val authors = listOf(
            Author("author-1", "Joanne", "Rowling"),
            Author("author-2", "Herman", "Melville"),
            Author("author-3", "Anne", "Rice")
        )

        fun getById(id: String) = authors.firstOrNull { it.id == id }
    }
}
