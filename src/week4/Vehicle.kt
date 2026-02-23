package week4

open class Vehicle (val brand: String ){
    var speed: Int = 0

    open fun accelerate() {
        speed+= 140
        println("$brand melaju. Kecepatan: $speed km/jam")

    }

    open fun honk() {
        println("Beep beep!")


    }
}