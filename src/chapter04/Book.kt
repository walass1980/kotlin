package chapter04

class Book {
    var title: String = "Everything about kotlin"
    var autor: String = "Jose Lujan"
    var isbn: String = "192838493"
}

fun main() {
    var mybook: Book = Book();
    println(mybook.autor)

    //Apply
    /*
    myBook.apply {
        title = "The Best Java book"
        autor = "Dimas Lujan"
        isbn = "10000000"
    }
     */
}