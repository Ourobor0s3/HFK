package Charter12

fun main() {
    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)

    var x1 = ""
    var x2 = 0
    x1 = myMap.keys.fold("") { x, y -> x + y}
    x2 = myMap.entries.fold(0) { x, y -> x * y.value }
    println("$x1$x2")

    x1 = ""
    x2 = myMap.values.groupBy { it }.keys.sumOf { it }
    println("$x1$x2")

    x1 = "ABCDE"
    x2 = myMap.values.fold(12) { x, y -> x - y }
    println("$x1$x2")

    x1 = ""
    x2 = myMap.entries.fold(1) { x, y -> x * y.value }
    println("$x1$x2")

    x2 = 0
    x1 = myMap.values.fold("") { x, y -> x + y }
    println("$x1$x2")

    x1 = myMap.values.fold(0) { x, y -> x + y }
        .toString()
    x2 = myMap.keys.groupBy { it }.size
    println("$x1$x2")

}