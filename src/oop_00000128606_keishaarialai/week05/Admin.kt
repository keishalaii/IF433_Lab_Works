package oop_00000128606_keishaarialai.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer untuk melayani administrasi.")
    }

    //fungsi unik yg dimiliki Admin
    fun PekerjaanAdmin() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}