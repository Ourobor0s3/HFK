package Charter8

class Cat(var name: String? = "") {
    fun Meow() { println("Meow!") }
}
fun main(args: Array<String>) {
    var myCats = arrayOf(Cat("Misty"),
        null,
        Cat("Socks"))
    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}