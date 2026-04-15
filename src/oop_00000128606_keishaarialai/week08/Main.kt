package oop_00000128606_keishaarialai.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, 250000)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kotak tidak diketahui."
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11 "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"//blok ini hanya akan jalan jika totalPrice tidak null
    }?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)
}