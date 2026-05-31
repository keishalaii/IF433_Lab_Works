package oop_00000128606_keishaarialai.week13

import java.io.File

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

// Serialization (Object -> CSV)
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

// Deserialization dengan try-catch untuk error handling
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

// Write System dengan use block dan printWriter
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
    println("Trades berhasil disimpan ke $path")
}