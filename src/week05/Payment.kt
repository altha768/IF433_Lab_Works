package week05

class Payment {

    abstract class PaymentMethod(val accontName:String) {

        abstract fun processPayment(amount:Double)
    }

}