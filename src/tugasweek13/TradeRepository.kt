package repository

import model.TradeRecord
import model.toCsv
import model.fromCsvTrade
import java.io.File
import java.io.FileNotFoundException

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan: $path")
        emptyList()
    }
}