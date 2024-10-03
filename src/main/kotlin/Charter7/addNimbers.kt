package Charter7

fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}

fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}

fun main(){
    println(addNumbers(2, 5))
    println(addNumbers(1.6, 7.2))

}