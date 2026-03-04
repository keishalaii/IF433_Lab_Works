package oop_00000128606_keishaarialai.week05

class Elective: MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Matkul Elective ${super.nama} sksnya $sks")
    }
}