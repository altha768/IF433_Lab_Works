package week05




class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {


    fun processPayment(amount: Double) {
        val accountName = ""
        println("--- Memproses Pembayaran E-Wallet ($accountName) ---")
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar Rp$amount berhasil.")
            val accountName = ""
            println("Sisa saldo $accountName: Rp$balance")
        } else {
            println("Gagal: Saldo tidak cukup untuk melakukan pembayaran sebesar Rp$amount.")
            println("Saldo saat ini: Rp$balance")
        }
    }


    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            val accountName = ""
            println("Top-up berhasil! Rp$amount ditambahkan ke akun $accountName.")
            println("Total saldo sekarang: Rp$balance")
        } else {
            println("Jumlah top-up harus lebih dari 0.")
        }
    }
}