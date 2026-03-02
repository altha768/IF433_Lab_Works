package week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }

    class CreditCard : PaymentMethod {
        override fun pay(amount: Double) {
            println("Countacting Bank for Rp$amount")
        }

    }
}