package oop_00000128606_keishaarialai.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn() // menjalankan logika camera
        super<Phone>.turnOn() //menjalankan logika phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}