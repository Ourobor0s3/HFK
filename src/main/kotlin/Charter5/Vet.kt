package Charter5

class Vet {
    fun giveShot(animal: Animal) {
        println("AFAFAFF")
        animal.makeNoise()
    }
}

fun main(args: Array<String>){
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}