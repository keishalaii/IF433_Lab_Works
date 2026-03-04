package oop_00000128606_keishaarialai.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    //fungsi unik yg dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}