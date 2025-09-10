class Myfile {
    private var name: String? = null
    fun setName(name: String) {
        this.name = name
    }

    fun getname(): String? {
        return name
    }

    fun hikotlin() {
        println("Hello World kotlin! ${this.name}")
    }
}