fun main(args: Array<String>) {
    fun testSmartCast(x: Any) {
        if (x is String) {
            println(x.length)
        }
    }
}