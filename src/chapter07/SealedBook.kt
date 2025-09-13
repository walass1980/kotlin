sealed class Book {

    abstract val title: String
    abstract val author: String
    abstract val year: Int

    class Fiction(
        override val title: String,
        override val author: String,
        override val year: Int,
        val genre: String

    ) : Book()

    class NonFiction(
        override val title: String,
        override val author: String,
        override val year: Int,
        val subject: String

    ) : Book()

    class TextBook(
        override val title: String,
        override val author: String,
        override val year: Int,
        val subject: String,
        val grade: Int

    ) : Book()

    class ComicBook(
        override val title: String,
        override val author: String,
        override val year: Int,
        val illustrator: String

    ) : Book()
}