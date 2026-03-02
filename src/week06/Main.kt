

package week06



interface PaymentMethodNew {
    fun pay(amount: Double)
}


class `Go pay` : PaymentMethod {
    override fun pay(amount: Double) = println("Membayar Rp$amount menggunakan Gopay.")
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) = println("Membayar Rp$amount menggunakan Kartu Kredit.")
}

class Smartwatch {
    fun ShowTime() = println("Saat ini pukul 12:00")
}

class Smartphone {
    fun turnOn() = println("Smartphone menyala.")
}


fun processCheckout(methode: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout...")
    methode.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.ShowTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = `Go pay`()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, amount = 600000.0)
    processCheckout(pay2, amount = 800000.0)
}