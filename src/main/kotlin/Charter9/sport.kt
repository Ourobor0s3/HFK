package Charter9

fun main(args: Array<String>) {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

    mList.sort()
    println(mList)

    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)

    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set)

    mList.sort()
    mList.reverse()
    println(mList)
}