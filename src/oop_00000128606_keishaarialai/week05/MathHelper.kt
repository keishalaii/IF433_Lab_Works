package oop_00000128606_keishaarialai.week05
import java.util.Scanner // saya pakai scanner

class MathHelper {

    // Fungsi untuk menghitung luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Fungsi untuk menghitung luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Fungsi untuk menghitung luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val mathHelper = MathHelper()

    println("==========================================")
    println("   PROGRAM MENGHITUNG LUAS BANGUN DATAR")
    println("==========================================")
    println()

    // 1. Menghitung Luas Persegi
    println("--- MENGHITUNG LUAS PERSEGI ---")
    print("Masukkan panjang sisi persegi: ")
    val sisi = scanner.nextInt()
    val luasPersegi = mathHelper.hitungLuas(sisi)
    println("Rumus: sisi x sisi")
    println("sisi = $sisi")
    println("Luas Persegi = $luasPersegi")
    println()

    // 2. Menghitung Luas Persegi Panjang
    println("--- MENGHITUNG LUAS PERSEGI PANJANG ---")
    print("Masukkan panjang: ")
    val panjang = scanner.nextInt()
    print("Masukkan lebar: ")
    val lebar = scanner.nextInt()
    val luasPersegiPanjang = mathHelper.hitungLuas(panjang, lebar)
    println("Rumus: panjang x lebar")
    println("panjang = $panjang, lebar = $lebar")
    println("Luas Persegi Panjang = $luasPersegiPanjang")
    println()

    // 3. Menghitung Luas Lingkaran
    println("--- MENGHITUNG LUAS LINGKARAN ---")
    print("Masukkan jari-jari lingkaran: ")
    val jariJari = scanner.nextDouble()
    val luasLingkaran = mathHelper.hitungLuas(jariJari)
    println("Rumus: 3.14 x jari-jari x jari-jari")
    println("jari-jari = $jariJari")
    println("Luas Lingkaran = $luasLingkaran")

    scanner.close()
}