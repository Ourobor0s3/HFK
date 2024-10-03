package Charter6

interface Roamble {
    var velocity: Int
        get() = 20
        set(value) {
            println("Unable to update velocity")
        }

    fun roam() {
        println("The Roamble is roaming")
    }

}