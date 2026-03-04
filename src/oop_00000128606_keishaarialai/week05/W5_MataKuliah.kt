package oop_00000128606_keishaarialai.week05

abstract class MataKuliah {
    var nama: String = ""

    abstract fun set_matkul(sks: Int)
    //kalo pake abstract, body nya harus kosong (no body{})

    fun hasil_matkul(){
        println("Matkul diminati")
    }
}