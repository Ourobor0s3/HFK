package Charter1

fun main(){
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("x is $x.")

    while (x > 20) {
        x = x - 1
        println(" x is now $x.")
    }
    for (i in 1..10) {
        x = x + 1
        println(" x is now $x.")
    }

    if (x == 20) {
        println(" x must be 20.")
    } else {
        println(" x isn't 20.")
    }
    if (name.equals("Cormoran")) {
        println("$name Strike")
    }

    x = 3
    val y = 1
    if (x > y) {
        println("x > y")
    } else {
        println("x <= y")
    }
}