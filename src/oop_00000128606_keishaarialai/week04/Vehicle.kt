package oop_00000128606_keishaarialai.week04

//menggunakan keyword 'open' agar class bisa diwariskan
open class Vehicle(val brand: String) {
    var speed: Int = 0

    //pakai 'open' supaya bisa di override
    open fun accelerate() {
        speed += 120
        println("$brand melaju dengan kecepatan $speed km/jam")
    }

    open fun honk(){
        println("Beep beep!")
    }
}
