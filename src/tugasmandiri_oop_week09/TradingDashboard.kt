package tugasmandiri_oop_week09

fun main() {
    val tradeHistory = listOf(
        TradingModels.TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradingModels.TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradingModels.TradeLog("SOLUSDT", "LONG", 5, 2.5, "OPEN"),
        TradingModels.TradeLog("BTCUSDT", "SHORT", 20, -12.0, "CLOSED"),
        TradingModels.TradeLog("BNBUSDT", "LONG", 10, 8.4, "CLOSED"),
        TradingModels.TradeLog("ETHUSDT", "LONG", 5, -1.5, "CLOSED")
    )


    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }


    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline 5
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }


    val uniquePairs = tradeHistory.map { it.pair }.toSet()


    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\nTop Winners:")
    topPerformersString.forEach { println(it) }

    println("\nWorst Losses:")
    worstPerformersString.forEach { println(it) }

    println("\nCoins Traded:")
    println(uniquePairs.joinToString(", "))
}