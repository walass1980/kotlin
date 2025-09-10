package chapter03

fun main(args: Array<String>) {
    var name: String? = "Joe"
    println(name)
    println(name.length)
    // println(name?.lenth)

    //Condition with String
    /*
        var name: String? = "Jose"
        if (name != null)
            println(name.length)
     */

    //Condition with null
    /*
    var name: String? = null
    if (name != null) {
        println(name.length)
    }else{
        println("Name is null")
    }

     */
}