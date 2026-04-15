package oop_00000128606_keishaarialai.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = OrderModels.Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kotak tidak diketahui."
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOK ===")
    val validOrder = OrderModels.Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"//blok ini hanya akan jalan jika totalPrice tidak null
    }?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Keisha", null),
        "Laptop",
        4500000.0
    )
    for (item in mixedData) {
        val text = item as? String
        //hanya cetak jika cast sukses
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
//    val toxicData: String? = null
//    try {
//        val lenght = toxicData!!.lenght
//    } catch (e: NullPointerException) {
//        println("CRASH (NPE)! Jangan Gunakan !! secara sembarangan.")
//    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        val token = requireNotNull(apiResponse["token"]){
            "CRITICAL EXCCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    val statusLength = javaResponse!!.length
    println("Status dari java: $javaResponse (lenght: $statusLength)")
}