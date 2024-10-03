package Charter2


fun printArray(array: Array<String>) : Unit {
    for (item in array) print(" $item")
    println(".")
}

fun printArray(array: Array<Int>) : Unit {
    for (item in array) print(" $item")
    println(".")
}

fun hobbits() : Unit{
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0;
    while (x < 4) {
        println("${hobbits[x]} is a good Hobbit name")
        x = x + 1
    }
}

fun fireman(): Unit {
    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0;
    while (firemanNo < 6) {
        println("Fireman number $firemanNo is ${firemen[firemanNo]}")
        firemanNo = firemanNo + 1
    }
}

fun fruit(){
    val index = arrayOf(1, 3, 4, 2)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    var x = 0
    var y: Int
    while (x < 4){
        y = index[x]
        println("Fruit =${fruit[y]}")
        x = x+1
    }
}