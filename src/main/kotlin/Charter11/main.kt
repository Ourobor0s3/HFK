package Charter11

fun main(){
    println("${addFive(1)}")
    var addfive = { x: Int -> x + 5 }
    addfive = { y: Int -> 5 + y }
    println(addfive(1))
    var addints = { x: Int, y: Int -> x + y}
    println(addints(2, 2))

}

fun addFive(x: Int) = x + 5