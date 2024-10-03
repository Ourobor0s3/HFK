package Charter7

fun main(){
    recipeTrue()
    recipeHashCode()
    recipeToString()

    val r1 = Recipe("Thai Curry", false)
    val r2 = r1.copy(isVegetarian = true)

    val r = Recipe("Chicken Bhuna", false)
    println(r.component1())
    println(r.title)

    val (title, vegetarian) = r
    println("$title - ${vegetarian}")
    println(r.component1())
    println(r.component2())
}

fun recipeTrue(){
    val r1 = Recipe("Chicken Bhuna", false)
    val r2 = Recipe("Chicken Bhuna", false)
    println(r1.equals(r2))
}

fun recipeHashCode(){
    val r1 = Recipe("Chicken Bhuna", false)
    val r2 = Recipe("Chicken Bhuna", false)
    println(r1.hashCode())
    println(r2.hashCode())
}

fun recipeToString(){
    val r1 = Recipe("Chicken Bhuna", false)
    println(r1.toString())
}