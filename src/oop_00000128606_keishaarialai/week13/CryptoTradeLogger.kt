package oop_00000128606_keishaarialai.week13

import java.io.File
import java.io.FileNotFoundException

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

// Load System dengan FileNotFoundException handling
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File $path tidak ditemukan!")
        emptyList()
    }
}

//mock data
fun main() {
    // Simulated trade records
    val trades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 1000.0, pnl = 250.0),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 500.0, pnl = 180.0),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long", margin = 300.0, pnl = -45.0)
    )
    saveTrades(trades, path = "crypto_trades.csv")

    // Inject malformed data untuk testing robustness
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Baris data koruptif berhasil di-inject untuk testing...")
}