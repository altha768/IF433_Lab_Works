package week10

fun main(){

    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generic in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = Pair("Bitcooin", 65000)
    println("Aset: ${itemPrice.second}, Harga: ${itemPrice.first} USD")

}