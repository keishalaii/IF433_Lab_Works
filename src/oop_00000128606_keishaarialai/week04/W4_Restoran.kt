package oop_00000128606_keishaarialai.week04

open class Restoran { //pakai open buat kalo punya class anak
    private var namaResto: String = ""
    protected var harga: Int = 0
    protected var stock: Int = 10

    init {
        namaResto = "Sushi Tei"
        println("\nResto saya $namaResto")
    }

    open public fun jual_makanan() { //tambahin open untuk override
        println("saya jual makananan")
    }
}