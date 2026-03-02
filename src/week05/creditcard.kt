package week05


class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {


    var usedAmount: Double = 0.0

    fun processPayment(amount: Double) {
        val accountName = ""
        println("--- Memproses Pembayaran Kartu Kredit ($accountName) ---")
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi Sukses!")
            println("Jumlah yang dibayar: Rp$amount")
            println("Sisa limit tersedia: Rp${limit - usedAmount}")
        } else {
            println("Transaksi Ditolak: Pembayaran sebesar Rp$amount melebihi limit kartu.")
            println("Limit tersedia: Rp${limit - usedAmount}")
        }
    }
}