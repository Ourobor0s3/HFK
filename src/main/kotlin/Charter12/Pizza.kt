package Charter12

data class Pizza(val name: String, val pricePerSlice: Double, val quantity: Int)
fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)
    val pizzas = listOf(Pizza("Sunny Chicken", 4.5, 4),
        Pizza("Goat and Nut", 4.0, 1),
        Pizza("Tropical", 3.0, 2),
        Pizza("The Garden", 3.5, 3))

    val minInt = ints.minBy({ it })
    val minInt2 = ints.minBy({ int: Int -> int })
    val sumInts = ints.sum()
    val sumInts2 = ints.sumOf { it }
    val sumInts3 = ints.sumOf({ it.toDouble() })
    val sumInts4 = ints.sumOf { int: Int -> int.toDouble() }

    val lowPrice2 = pizzas.minBy({ it.pricePerSlice })
    val highQuantity = pizzas.maxBy { p: Pizza -> p.quantity }
    val highQuantity3 = pizzas.maxBy { it.quantity }
    val totalPrice = pizzas.sumOf { it.pricePerSlice * it.quantity }
    val totalPrice2 = pizzas.sumOf { it.pricePerSlice * it.quantity }
}