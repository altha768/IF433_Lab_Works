package tugasweek10

fun main() {

    fun main() {

        val coinRepo = WalletRepository<Coin>()

        coinRepo.add(Coin("BTC", 0.523))
        coinRepo.add(Coin("ETH", 1.25))
        coinRepo.add(Coin("USDT", 500.0))



        val response = NetworkResponse.ApiResponse("200 OK", coinRepo.getAll())

        println("Response Status: ${response.status}")
        response.data.forEach { coin ->
            println("Coin: ${coin.name} | Balance: ${coin.balance}")
        }

        val txRepo = WalletRepository<Transaction>()
        txRepo.add(Transaction("TXN001", 0.01))
        txRepo.add(Transaction("TXN002", 250.0))

        println("\nTransaction Logs:")
        txRepo.getAll().forEach { tx ->
            println("ID: ${tx.id} | Amount: ${tx.amount}")
        }


        println("\nSystem Test: Success (Generic Architecture Valid)")

    }


}