package Charter9

fun main(){
    val shopping1 = listOf("Tea", "Eggs", "Milk")
    val shopping2: List<String>
    shopping2 = listOf("Tea", "Eggs", "Milk")

    if (shopping2.size > 0) {
        println(shopping2.get(0))
    }
    println(shopping2)

    if (shopping2.contains("Milk")) {
        println(shopping2.indexOf("Milk"))
    }

    val mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add("Milk")
    println(mShopping)
    mShopping.add(1, "Milk")
    println(mShopping)
    if (mShopping.contains("Milk")) {
        mShopping.remove("Milk")
    }
    println(mShopping)

    if (mShopping.size > 1) {
        mShopping.removeAt(1)
    }
    println(mShopping)
    if (mShopping.size > 0) {
        mShopping.set(0, "Coffee")
    }
    println(mShopping)

    mShopping.sort()
    mShopping.reverse()
    mShopping.shuffle()
    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)
    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)
    val toRetain = listOf("Milk", "Sugar")
    mShopping.retainAll(toRetain)
    mShopping.clear()

}