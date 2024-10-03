package Charter8

fun main(args: Array<String>) {
    //val test: String = "No"
    val test: String = "Yes"
    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }
    println("End of main")

    println("----")
    myFunctions("No")
}
class BadException : Exception()
fun riskyCode(test: String) {
    println("Start risky code")
    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code")
}

fun myFunctions(test: String) {
    try {
        print("t")
        riskyCode2(test)
        print("o")
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
        print("s")
    }
}
fun riskyCode2(test:String) {
    print("h")
    if (test == "Yes") {
        throw BadException()
    }
    print("r")
}