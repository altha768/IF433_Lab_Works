package week8




class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): EcommerceModels.Product? {

        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                EcommerceModels.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                EcommerceModels.Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: EcommerceModels.Product) {
        val id = when (product) {
            is EcommerceModels.Electronic -> product.id
            is EcommerceModels.Clothing -> product.id
            else -> {}
        }
        val transactionId = JavaPaymentService.processPayment(id as String?)!!
        println("Checkout Berhasil! ID Transaksi: $transactionId")
    }
}