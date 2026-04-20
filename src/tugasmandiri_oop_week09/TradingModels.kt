package tugasmandiri_oop_week09

class TradingModels {
    data class TradeLog(
        val pair: String,
        val position: String,
        val leverage: Int,
        val roe: Double,
        val status: String
    )
}