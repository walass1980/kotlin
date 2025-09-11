fun String.isPalidrome() = this.reversed().equals(this, true)

fun main() {

    println("Hello, world!!!".isPalidrome())

    println("Anna".isPalidrome())
}

