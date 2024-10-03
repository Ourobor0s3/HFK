package Charter6

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

fun main(){
   var ve = Vehicle()
    ve.roam()
}