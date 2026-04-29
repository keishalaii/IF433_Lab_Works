package oop_00000128606_keishaarialai.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 2500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("--- CRYPTO DASHBOARD ---")
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 150.0))
    txRepo.add(Transaction("TX002", 3000.5))
}