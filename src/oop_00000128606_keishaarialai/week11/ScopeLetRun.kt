package oop_00000128606_keishaarialai.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Ubah nama variabel luar dari 'length' menjadi 'panjangNama' agar tidak bentrok
    val panjangNama = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $panjangNama")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")

        // Akses langsung properti length milik string "Kotlin" tanpa bingung
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}