package week8

data class City(val name: String?)
data class Address(val city: City?)
data class DeliveryDetails(val address: Address?)

data class Order(
    val id: Int?,
    val status: String?,
    val deliveryDetails: DeliveryDetails? = null,
    val totalPrice: Int? = null // Menambahkan field yang hilang agar .let bisa bekerja
)

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")

    val emptyOrder = Order(null, null)

    val statusLength = emptyOrder.status?.length
    println("Panjang status: $statusLength")

    val statusDisplay = emptyOrder.status ?: "Status Tidak Tersedia"
    println("Tampilan Status: $statusDisplay")

    val finalLength = emptyOrder.status?.length ?: 0
    println("Panjang status (dengan default): $finalLength")

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")

    val validOrder = Order(null, "Processing", null, 250000)

    validOrder.totalPrice?.let { price ->

        val tax = price * 0.11
        "Transaksi valid. Harga: Rp$price, Pajak (11%): Rp$tax"
    } ?: "Transaksi invalid: Harga belum di-set!"

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1600000,
        UserProfile("Andi", null),
        "Laptop",
        4600000.0
    )

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")

            val someObject: Any = 100

            val safeString = someObject as? String ?:"Unknown String"
            println("Hasil cast + fallback: $safeString")

            println("\n=== TEST THE RED BUTTON (!!) ===")
            val toxicData: String? = null
            try{
                val lenght = toxicData!!.length
            } catch (e: NullPointerException) {
                println("CRASH (NPE)! jagan gunakan !! secara sembarangan.")

                val apiResponse: Map<String, String?> = mapOf("status" to "200","token" to null)
                try {

                    val token = requireNotNull(apiResponse["token"]) {
                        "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"

                    }
                } catch (e: NullPointerException) {
                    println(e.message)

                    println("\n=== TEST JAVA INTEROP ===")
                    val javaResponse =  LegacyJavaAPI.fetchServerStatus()

                    val statusLength = javaResponse.
                    println("Status dari java: $javaResponse (Length: $statusLength)")



                }

            }        }
    }

}

private fun Unit.println(string: String) {}


