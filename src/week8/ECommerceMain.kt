package week8

class ECommerceMain {

    fun main() {
        val rawApiData: List<Map<String, Any?>> = listOf(
            mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
            mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
            mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
            mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
            mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
        )

        val parser = ApiParser()

        println("=== MEMPROSES DATA API E-COMMERCE ===")

        for (raw in rawApiData) {
            try {
                val product = parser.parseProduct(raw)


                product?.let {
                    println("Memproses: ${it.javaClass.simpleName}...")
                    parser.checkout(it)
                } ?: println("Log: Melewatkan item karena tipe tidak dikenal.")

            } catch (e: IllegalArgumentException) {
                println("ERROR LOG: ${e.message}")
            }
            println("-----------------------------------")
        }
    }

}