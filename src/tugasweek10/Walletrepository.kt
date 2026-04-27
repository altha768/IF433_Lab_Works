package tugasweek10

class WalletRepository<T : `Wallet model`.Nameable> {

    private val items: MutableMap<T, Int> = mutableMapOf()

    fun add(item: T) {
        item.add(item)

    }


}