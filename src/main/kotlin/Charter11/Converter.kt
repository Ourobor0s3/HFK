package Charter11


typealias DoubleConversion = (Double) -> Double
fun convert(x: Double, converter: DoubleConversion) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun main(){
    val fahrenheit = convert(20.0, { c: Double -> c * 1.8 + 32 })
    convertFive { it * 1.8 + 32 }
    val pounds = getConversionLambda("KgsToPounds")(2.5)


    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }
    val kgsToUSTons = combine(kgsToPounds, poundsToUSTons)
    val usTons = kgsToUSTons(1000.0)
    println(usTons)


}

fun convertFive(converter: (Int) -> Double) : Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun getConversionLambda(str: String): (Double) -> Double {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}

fun combine(lambda1: (Double) -> Double,
            lambda2: (Double) -> Double): (Double) -> Double {
    return { x: Double -> lambda2(lambda1(x)) }
}
