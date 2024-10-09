package Charter11

fun main(){
    println("${addFive(1)}")
    var addfive = { x: Int -> x + 5 }
    addfive = { y: Int -> 5 + y }
    println(addfive(1))
    var addints = { x: Int, y: Int -> x + y}
    println(addints(2, 2))

    val msg = { x: Int -> "The value is $x" }
    println(msg(3))
    val add: (Int, Int) -> Int
    add = { x: Int, y: Int -> x + y}
    val greeting: () -> String
    greeting = { "Hello!"}
    println(greeting())

    val addThree: (Int) -> Int = { it + 3 }
    println(addThree(0))

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

    val calculation: (Int, Int) -> Unit = { x, y -> println(x + y)}
    calculation(1, 10)
}

fun addFive(x: Int) = x + 5