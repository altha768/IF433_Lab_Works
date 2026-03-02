package week06

interface Wearable {
    fun showTime()
    fun connectToBluetooth()
    fun chargeBattery()
}

class SmartwatchV2 : Wearable {
    override fun showTime() {
        println("Layar Oled menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15w.")
    }
}

fun main() {
    // Change 'Smartwatch()' to 'SmartwatchV2()'
    val myWatch = SmartwatchV2()
    myWatch.showTime()
}