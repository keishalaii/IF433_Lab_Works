package oop_00000128606_keishaarialai.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 12.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, -25.0, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 10, 8.4, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, -2.1, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("Top Winners:")
    topPerformersString.forEach { println(it) }

    println("\nWorst Losses:")
    worstPerformersString.forEach { println(it) }
    println("\nTraded Pairs: $uniquePairs")
}

//OUTPUT
//=== CRYPTO TRADING DASHBOARD ===
//Top Winners:
//WIN [BTCUSDT - LONG]: +15.5% ROE (Lev: 20x)
//WIN [BNBUSDT - LONG]: +8.4% ROE (Lev: 10x)

//Worst Losses:
//LOSS [BTCUSDT - SHORT]: -25.0% ROE (Lev: 50x)
//LOSS [ETHUSDT - SHORT]: -5.2% ROE (Lev: 10x)
//LOSS [ETHUSDT - LONG]: -2.1% ROE (Lev: 20x)

//Traded Pairs: [BTCUSDT, ETHUSDT, SOLUSDT, BNBUSDT]