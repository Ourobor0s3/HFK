package Charter1

fun main(){
    val name = "Misty"
    val height = 9
    println("Hello")
    println("My cat is called $name")
    println("My cat is $height inches tall")
    val a = 6
    val b = 7
    val c = a + b + 10
    val str = c.toString()
    val numList = arrayOf(1, 2, 3)
    var x = 0
    while (x < 3) {
        println("Item $x is ${numList[x]}")
        x = x + 1
    }

//    val myCat = Cat(name, height)
//    val y = height - 3
//    if (y < 5) myCat.miaow(4)
//    while (y < 8) {
//        myCat.play()
//        y = y + 1
//    }
}