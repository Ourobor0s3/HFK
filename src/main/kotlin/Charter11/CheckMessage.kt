package Charter11

fun main(){
    val x = 20
    val y = 2.3
    val lam1 = { x: Int -> x }
    println(lam1(x + 6))

    val lam2: (Double) -> Double
    lam2 = { (it * 2) + 5}
    println(lam2(y))

    val lam3: (Double, Double) -> Unit
    lam3 = { x, y -> println(x + y)}
    lam3.invoke(y, y)

    var lam4 = { y: Int -> (y/2).toDouble() }
    print(lam4(x))
    lam4 = { it + 6.3 }
    print(lam4(7))
}