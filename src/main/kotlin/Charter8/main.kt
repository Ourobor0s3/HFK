package Charter8

import printArray

fun main() {
    var str1: String? = "Pizza"
    var str2: String? = null
    println(str2)
    printInt(null)

    var myArray1: Array<String?>  = arrayOf("Hi", "Hello", null)
    printArray(myArray1)

    var w: Wolf? = Wolf()
    if (w != null) {
        w.eat()
    }

    if (w != null && w.hunger < 5) {
        w.eat()
    }

    println(w?.hunger)
    var myWolf: MyWolf? = MyWolf()
    myWolf?.wolf?.hunger

    if (w != null ) {
        println(w.hunger)
    }
    w?.let {
        println(it.hunger)
    }

    var array = arrayOf("Hi", "Hello", null)
    for (item in array) {
        item?.let {
            println(it)
        }
    }

    var alpha = getAlphaWolf()
    if (alpha != null) alpha.eat()
    getAlphaWolf()?.let {
        it.eat()
    }

    if (w != null) w.hunger else -1
    // или
    w?.hunger ?: -1
    println("${w!!.hunger}")
}

fun printInt(x: Int?) {
    println(x)
}

fun result() : Long? {
    return null
}


