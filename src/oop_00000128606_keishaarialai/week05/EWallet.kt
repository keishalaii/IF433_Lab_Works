package oop_00000128606_keishaarialai.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - EWallet] Pembayaran sebesar Rp $amount berhasil. Sisa saldo: Rp $balance")
        } else {
            println("[$accountName - EWallet] Saldo tidak cukup! Saldo: Rp $balance, dibutuhkan: Rp $amount")
        }
    }

    // Fungsi spesifik untuk top up saldo
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - EWallet] Top up sebesar Rp $amount berhasil. Saldo sekarang: Rp $balance")
    }
}