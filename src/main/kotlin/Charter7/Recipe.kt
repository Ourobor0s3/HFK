package Charter7

data class Recipe(val title: String, val isVegetarian: Boolean) {
    var mainIngredient = ""
}

fun main(){
    val r1 = Recipe("Thai curry", false)
    r1.mainIngredient = "Chicken"
    val r2 = Recipe("Thai curry", false)
    r2.mainIngredient = "Duck"
    println(r1 == r2)
}