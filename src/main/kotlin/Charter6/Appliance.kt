package Charter6

abstract class Appliance {
    var pliggedIn = true
    abstract val volor: String

    abstract fun consumePower()
}

class CoffeMaker : Appliance() {
    override val volor = ""
    var coffeLeft = false
    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater(){
        println("Fill with water")
    }

    fun makeCoffe() {
        println("Make the coffe")
    }
}