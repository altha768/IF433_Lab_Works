package oop_001_johnthor.week07


object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected"
        println("DatabaseManager: Berhasil tersambung ke Database.")
    }
}

class NetworkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}


fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")

    val client = NetworkClient.createClient()
    client.connect()


}