package Charter6

class MyRoamable {
    var r: Roamable = Wolf()
    fun myFunction() {
        if (r is Wolf) {
            var wolf = r as Wolf
            wolf.eat()
        }
    }
}