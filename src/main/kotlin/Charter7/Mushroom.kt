package Charter7

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
    }
}

fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Resipe> {
    return arrayOf(Resipe(title, ingredient, isVegetarian, difficulty))
}

fun main(){
    val recipes = findRecipes(title = "Thai curry")
    println(recipes[0].title)
}