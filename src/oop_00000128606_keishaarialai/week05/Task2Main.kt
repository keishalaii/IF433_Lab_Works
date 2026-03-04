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
}