package Charter3

fun max(a: Int, b: Int): Int = if (a > b) a else b

// Варианты функции max
//fun max(a: Int, b: Int): Int {
//    val maxValue = if (a > b) a else b
//    return maxValue
//}


fun printSum(int1: Int, int2: Int) : Unit = println(int1 + int2)

// Варианты функции printSum
//fun printSum(int1: Int, int2: Int): Unit {
//    val result = int1 + int2
//    println(result)
//}

fun timesThree(x: Int): Int {
    val y = x * 3
    return y
}

fun maxValue(args: Array<Int>) : Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}

fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x = x + 1
        }
    }
}