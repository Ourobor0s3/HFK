package Charter3

fun main(args: Array<String>){
    for (x in 15 downTo 1) print("$x ")
    println()
    for (x in 1..5) print("$x ")
    println()
    for (x in 6 until 10) print("$x ")
    println()
    for (x in 1..10 step 2) print("$x ")
    println()
    println(max(5, 1))
    printSum(5, 1)

    val options = arrayOf("Rock", "Paper", "Scissors")
    updateArray(options)
    println(options[2])

    doSomething("Hi", 2)
    timesThree(10)
    maxValue(arrayOf(3, 5, 1))

    var x = 0
    var y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            y = x + y
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")

    var price : Int = 250
    if (price >= 200 && price <= 300) {
        println("Код выбора телефона")
    }
    if (price <= 10 || price >= 1000) {
        println("Телефон слишком дешевый или слишком дорогой")
    }

    var model : Int = 100
    if (model != 2000) {
        println("Код выполняется, если значение model не равно 2000")
    }
    var isBroken: Boolean = false
    while (!isBroken) {
        println("Код выполняется, если телефон не сломан")
        isBroken = true
    }
    var memory : Int = 32
    if ((price <= 500 && memory >= 16)
        || (price <= 750 && memory >= 32)
        || (price <= 1000 && memory >= 64)) {
        println("Сделать то, что нужно")
    }
}


fun updateArray(optionsParam: Array<String>) {
    optionsParam[2] = "Fred"
}
