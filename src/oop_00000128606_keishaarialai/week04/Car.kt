package oop_00000128606_keishaarialai.week04

//Parameter brand dilempar ke atas melalui Vehicle(brand)
open class car (brand: String, val numberOfDoors: Int): Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu, dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() //memanggil logika penambah kecepatan milik parent
        println("Mobil $brand menggunakan transimisi gigi untuk menambah kecepatan)
    }
}