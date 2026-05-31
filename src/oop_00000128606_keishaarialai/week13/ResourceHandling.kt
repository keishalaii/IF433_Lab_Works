package oop_00000128606_keishaarialai.week13

import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    // Membuka stream secara manual
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // Wajib dipanggil secara manual jika tidak menggunakan blok 'use'
    writer.close()
    println("Proses penulisan unsafe selesai...")
}