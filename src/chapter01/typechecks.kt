package chapter01

fun main(args: Array<String>) {
    val name = "Noemi"
    // We will see word "Sting" as a result bacause the name is a string and then the condition is true
    if (name is String) {
        println("String")
    }
    //if we use !is, the condition is not met and, therefore, we will not execute the code found within the if condition.
    if (name !is String) {
        println("String")
    }

}