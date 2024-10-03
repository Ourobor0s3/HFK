package Charter2

fun main(args: Array<String>){
    var x1 = 42L
    println("${x1.toInt()}")
    var x2 = 1234567890123
    println("${x2.toInt()}")
    var x3 = 123.456
    println("${x3.toInt()}")
    var x4 = 42
    println("Value of x4 is $x4")


    var myArray = arrayOf(1, 2, 3)
    println("myArray has ${myArray.size} items")
    println("The first item is ${myArray[0]}")
    println("myArray is ${if (myArray.size > 10) "large" else "small"}")

    printArray(myArray)
    myArray = arrayOf(4, 5)
    printArray(myArray)

    hobbits()
    fireman()
    fruit()
}