package tugasweek10

interface NamedEntity {
    val name: String
}

data class Coin(override val name: String, val balance: Double) : NamedEntity

data class Transaction(val id: String, val amount: Double)