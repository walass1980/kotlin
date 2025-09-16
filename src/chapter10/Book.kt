data class Book (
    val title: String,
    val author: String,
    val genre: String,
    val year: Int,
    val rating: Double,
    val pages: Int
)

fun main() {
    val books = listOf(
        Book("The Pragmatic Programmer", "Dave tomas", "Programming", 1999, 4.8,320),
        Book("Clean code", "Robert Martin", "Programming", 2008, 4.7, 464),
        Book("Design Patterns", "Gang of Four", "Programming", 1999, 4.7, 431),
        Book("Domain-Driven Design", "Eric Evans", "Programming", 2003, 4.5, 560)
    )

    val (longBooks, shortBooks) = books.partition { it.pages > 400 }
}

