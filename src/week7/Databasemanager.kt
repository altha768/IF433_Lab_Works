package week7

class Databasemanager {

    object DatabaseManager{
        var connectionStatus: String ="Disconnected"

        fun connect() {
            connectionStatus = "Connected to Server"
            println("Database is ready.")
        }
}
}