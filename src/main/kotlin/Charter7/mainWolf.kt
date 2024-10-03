package Charter7

import Charter6.Wolf

fun main(){
    wolfTrue()
    wolfFalse()
    wolfHashCode()
    wolfToString()
}

fun wolfFalse(){
    val w1 = Wolf()
    val w2 = w1
    println(w1.equals(w2))
}

fun wolfTrue(){
    val w1 = Wolf()
    val w2 = Wolf()
    println(w1.equals(w2))
}

fun wolfToString(){
    val w = Wolf()
    println(w.toString())
}

fun wolfHashCode(){
    val w = Wolf()
    println(w.hashCode())
}