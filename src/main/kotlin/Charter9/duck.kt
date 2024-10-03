package Charter9

fun main(args: Array<String>) {
    val set = setOf(Duck(), Duck(17))
    println(set)
}

class Duck(val size: Int = 17) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is Duck && size == other.size) return true
        return false
    }
    override fun hashCode(): Int {
        return size
    }
}

//class Duck(val size: Int = 17) {
//    override fun equals(other: Any?): Boolean {
//        return false
//    }
//    override fun hashCode(): Int {
//        return 7
//    }
//}