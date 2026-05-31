package oop_00000128606_keishaarialai.week13

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

// Serialization (Object -> CSV)
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

// Deserialization (CSV -> Object) - return type nullable
fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return TradeRecord(
        id = parts[0].toInt(),
        symbol = parts[1],
        type = parts[2],
        margin = parts[3].toDouble(),
        pnl = parts[4].toDouble()
    )
}