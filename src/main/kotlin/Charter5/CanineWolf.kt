package Charter5

open class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}
class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("Hooooowl!")
    }
    override fun eat() {
        println("The Wolf is eating $food")
    }
}

fun main(args: Array<String>){
    val w = Wolf()
    w.makeNoise()
    w.roam()
    w.sleep()

    val animal: Animal = Wolf()
    animal.eat()
    println()
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

}