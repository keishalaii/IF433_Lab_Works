package oop_00000128606_keishaarialai.week05

fun main() {
    println("=== SISTEM PEMBAYARAN ===")

    val eWallet = EWallet("GoPay", 50000.0)
    val creditCard = CreditCard("Visa", 100000.0)
    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    // Perulangan untuk memproses pembayaran
    println("Proses pembayaran Rp 75.000:")
    for(method in paymentMethods) {
        println(method.accountName + ":")
        method.processPayment(75000.0)
    }
    println("-------------------------------------")

    // Smart Casting: Deteksi EWallet dan Top Up
    println("Smart Casting - Deteksi EWallet:")
    for(method in paymentMethods) {
        println("Memeriksa " + method.accountName + ": ")
        if(method is EWallet) {
            println("-> Terdeteksi EWallet. Melakukan top up Rp 50.000")
            method.topUp(50000.0)
            println("-> Mencoba pembayaran Rp 75.000 lagi:")
            method.processPayment(75000.0)
        } else {
            println("Bukan EWallet (CreditCard)")
        }
        println()
    }

    println("Status Akhir:")
    println("GoPay saldo: Rp " + eWallet.balance)
    println("Visa terpakai: Rp " + creditCard.usedAmount + ", sisa limit: Rp " + (creditCard.limit - creditCard.usedAmount))
}