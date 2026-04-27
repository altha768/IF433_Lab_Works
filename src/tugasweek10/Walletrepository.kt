package tugasweek10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items


    fun <T> findByName(items: List<T>, query: String): T? where T : NamedEntity {
        return items.find { it.name.equals(query, ignoreCase = true) }
    }
}