package oop_00000128606_keishaarialai.week04

//Parameter brand dilempar ke atas melalui Vehicle(brand)
open class car (brand: String, val numberOfDoors: Int): Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu, dibuka.")
    }
}