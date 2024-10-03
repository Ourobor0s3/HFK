package Charter4

class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean) {
    fun playTopHat(){
        if (hasTopHat) println("ding ding ba-da-bing")
    }
    fun playSnare(){
        if (hasSnare) println("bang bang bang")
    }
}