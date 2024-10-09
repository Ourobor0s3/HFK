package Charter12

data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double,
                   val quantity: Int)
fun main(args: Array<String>) {
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))


    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")

    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumOf { it.quantity }
    println("sumQuantity: $sumQuantity")

    val totalPrice = groceries.sumOf { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")

    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("vegetables: $vegetables")
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")

    val ints = listOf(1, 2, 3)
    val doubleInts = ints.map { it * 2 }
    println(doubleInts)


    val groceryNames = groceries.map { it.name }
    println("groceryNames: $groceryNames")
    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfUnitPrice: $halfUnitPrice")
    val newPrices = groceries.filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }
    println("newPrices: $newPrices")

//    for (item in groceries) {
//        if (item.unitPrice > 3.0) println(item.name)
//    }
    groceries.filter { it.unitPrice > 3.0 }
        .forEach { println(it.name) }

    var itemNames = ""
//    for (item in groceries) {
//        itemNames += "${item.name} "
//    }
    groceries.forEach({ itemNames += "${it.name} " })
    println("itemNames: $itemNames \n")

    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println(" ${it.name}") }
    }

    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")
    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item }
    println("productOfInts: $productOfInts")
    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("names: $names")
    val changeFrom50 = groceries.fold(50.0) { change, item
        -> change - item.unitPrice * item.quantity }
    println("changeFrom50: $changeFrom50")
}