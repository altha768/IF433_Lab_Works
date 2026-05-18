package model
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        val id = parts[0].trim().toInt()
        val symbol = parts[1].trim()
        val type = parts[2].trim()
        val margin = parts[3].trim().toDouble()
        val pnl = parts[4].trim().toDouble()

        TradeRecord(id, symbol, type, margin, pnl)
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}