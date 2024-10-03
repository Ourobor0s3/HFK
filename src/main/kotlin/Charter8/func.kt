package Charter8

fun main(){
    myFunction("122")
    myFunction("ggr")
}

fun myFunction(str: String) {
    try {
        val x = str.toInt()
        println(x)
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        println("Bummer")
    } finally {
        println("myFunction has ended")
    }
}