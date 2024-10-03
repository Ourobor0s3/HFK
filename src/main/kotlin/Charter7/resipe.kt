package Charter7

data class Resipe(val title: String,
                  val mainIngredient: String,
                  val isVegetarian: Boolean = false,
                  val difficulty: String = "Easy") {
}

fun main(){
    val r1 = Resipe("Thai curry", "Chicken", false, "Easy")
    val r2 = Resipe("Spaghetti Bolognese", "Beef")
    val r3 = Resipe("Spaghetti Bolognese", "Tofu", true)
    val r4 = Resipe(title = "Spaghetti Bolognese", mainIngredient = "Beef")
    val r5 = Resipe(mainIngredient = "Beef", title = "Spaghetti Bolognese")


}