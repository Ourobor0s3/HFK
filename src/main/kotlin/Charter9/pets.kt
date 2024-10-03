package Charter9

fun main(){
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    var pets: MutableList<String> = mutableListOf()
    pets.addAll(petsLiam)
    pets.addAll(petsSophia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)

    println(pets.size)
    val petSet = pets.toMutableSet()
    println(petSet.size)
    val petList = petSet.toMutableList()
    petList.sort()
    println(petList)
}
