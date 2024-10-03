package Charter9

fun main(){
    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val recipeMap: Map<String, Recipe> = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)

    println(recipeMap.containsKey("Recipe1"))
    val recipeToCheck = Recipe("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck)) {
        println("good1")
    }
    for ((key, value) in recipeMap) {
        println("Key is $key, value is $value")
    }

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap.put("Recipe3", r3)
    println(mRecipeMap)
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println(mRecipeMap)
    mRecipeMap.remove("Recipe2")
    val recipeToRemove = Recipe("Quinoa Salad",)
    mRecipeMap.remove("Recipe2", recipeToRemove)
    println(mRecipeMap)

    val recipeMapCopy = mRecipeMap.toMap()
    val RecipeList = mRecipeMap.toList()
    val recipeEntries = mRecipeMap.entries
    if (mRecipeMap.size > mRecipeMap.values.toSet().size) {
        println("mRecipeMap contains duplicates values")
    }
    mRecipeMap.values.toSet()
}