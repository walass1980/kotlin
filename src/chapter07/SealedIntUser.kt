sealed interface UserRole

object Admin : UserRole {

    fun addBook(title: String, author: String) {
        println("Book '$title' by $author added.")
    }

    fun deleteBook(title: String) {
        println("Book '$title deleted.")
    }

}

object Editor : UserRole {
    fun editBook(title: String, newDetails: String) {
        println("Book '${title}' updated with new details: $newDetails")
    }
}

object Reader : UserRole {
    fun readBook(title: String) {
        println("Reading book: $title")
    }

}

fun handleUserAction(user: UserRole, action: String, bookTitlle: String, details: String? = null) {

    when (user) {
        is Admin -> {
            if (action == "add") user.addBook(bookTitlle, details ?: "Unknown")
            if (action == "delete") user.deleteBook(bookTitlle)
        }

        is Editor -> {
            if (action == "edit") user.editBook(bookTitlle, details ?: "No details provided")
        }

        is Reader -> {
            if (action == "read") user.readBook(bookTitlle)
        }

    }

}

