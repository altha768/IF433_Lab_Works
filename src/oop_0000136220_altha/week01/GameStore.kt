package oop_0000136220_altha.week01

fun main() {

    val gameTitle = "Elden Ring: Shadow of the Erdtree"
    val originalPrice = 599000.0


    val discountRate = if (originalPrice > 500000) 0.2 else 0.1
    val finalPrice = originalPrice * (1 - discountRate)


    displayReceipt(
        title = gameTitle,
        basePrice = originalPrice,
        totalPrice = finalPrice,
        discountPercent = (discountRate * 100).toInt()
    )
}


fun displayReceipt(title: String, basePrice: Double, totalPrice: Double, discountPercent: Int) {
    println("=== Toko Digital SteamKW ===")
    println("Judul Game   : $title")
    println("Harga Asli   : Rp %,.0f".format(basePrice))
    println("Diskon       : $discountPercent%")
    println("Harga Akhir  : Rp %,.0f".format(totalPrice))
    println("============================")
}