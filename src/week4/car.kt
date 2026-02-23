package week4

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")

        fun honk() {
            println("TIN TIN! mobil $brand lewat!")

            fun accelerate(){
                super.accelerate()
                println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")

            }
        }
    }
}