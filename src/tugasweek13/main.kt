package tugasweek13

import model.TradeRecord
import repository.saveTrades
import repository.loadTrades
import java.io.File


fun main() {
    val filePath = "crypto_trades.csv"


    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 150.0, 45.5),
        TradeRecord(2, "ETHUSDT", "Short", 100.0, -12.3),
        TradeRecord(3, "SOLUSDT", "Long", 50.0, 15.8)
    )
    saveTrades(mockTrades, filePath)
    println(">>> Data simulasi berhasil disimpan.")


    File(filePath).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println(">>> Malformed data sengaja diinjeksikan ke dalam file CSV.\n")

    println("--- Memulai Proses Loading Data ---")
    val loadedData = loadTrades(filePath)
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n--- Daftar Transaksi Valid yang Berhasil Diproses ---")
    loadedData.forEach { trade ->
        println("ID: ${trade.id} | ${trade.symbol} (${trade.type}) | Margin: $${trade.margin} | PnL: $${trade.pnl}")
    }

    println("\n====================================")
    println("==== TOTAL PnL BERSIH: $totalPnl ====")
    println("====================================")
}