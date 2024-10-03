package Charter6

fun main(){
    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
    }

    val animal: Animal = Wolf()
    if (animal is Wolf) {
        animal.eat()
    }

    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

    val str = if (animal is Wolf) "Wolf" else "not Wolf"

    for (roamable in roamables) {
        if (roamable is Animal && roamable.hunger < 5) {
            println("${roamable.image} голоден")
        }
        if (roamable !is Animal || roamable.hunger >= 5) {
            println("Сытое животное")
        }
    }

    while (animal is Wolf){
        break
    }

    val x = 0
    when (x) {
        0 -> println("x is zero")
        1, 2 -> println("x is 1 or 2")
        else -> {
            println("x is neither 0, 1 nor 2")
            println("x is some other value")
        }
    }

    val roamable = roamables[0]
    when (roamable) {
        is Wolf -> {
            println("wolf")
        }
        is Hippo -> {
            println("hippo")
        }
        is Animal -> {
            println("Animal")
        }
    }
}