package Charter11

fun myFun3(x: Int = 6, y: (Int) -> Int = { x: Int -> x + 6 }): Int {
    return y(x)
}
fun myFun4(x: Int, y: Int,
           z: (Int, Int) -> Unit = {
                   x: Int, y: Int -> println(x + y)
           }) {
    z(x, y)
}
fun myFun5(x: (Int) -> Int = {
    println(it)
    it + 7
}) {
    x(4)
}

fun main(){
    println(myFun3())
    myFun4(1, 5)
    myFun5()
}