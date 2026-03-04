package oop_00000128606_keishaarialai.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - CreditCard] Pembayaran sebesar Rp $amount berhasil. Sisa limit: Rp ${limit - usedAmount}")
        } else {
            println("[$accountName - CreditCard] Transaksi ditolak! Melebihi limit. Limit tersisa: Rp ${limit - usedAmount}")
        }
    }
}