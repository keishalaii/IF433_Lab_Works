package oop_00000128606_keishaarialai.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kotak tidak diketahui."
    println("Tujuan pengiriman: $destination")
}