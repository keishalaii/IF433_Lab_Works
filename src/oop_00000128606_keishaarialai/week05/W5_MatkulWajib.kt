package oop_00000128606_keishaarialai.week05

class Wajib: MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP"
        println("Matkul ${super.nama} sksnya $sks")
    }
}