package Charter4

fun main(args: Array<String>) {
    var myDog = Dog("Fido", 70, "Mixed")
    println(myDog.name)
    myDog.weight = 75
    myDog.bark()
    var dogs = arrayOf(Dog("Fido", 70, "Mixed"), Dog("Ripper", 10, "Poodle"))
    dogs[1].weight = 15
    dogs[1].bark()

    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()

    val d = DrumKit(true, true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()

    var myDuck = Duck()

}