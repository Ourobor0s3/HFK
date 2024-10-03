package Charter8

fun main(){
    try {
        setWorkRatePercentage(110)
    } catch(e: IllegalArgumentException) {
        e.printStackTrace()
        println("not good")
    }
}

fun setWorkRatePercentage(x: Int) {
    if (x !in 0..100) {
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }
    println("good")
}