package oop_00000128606_keishaarialai.week06

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jumlahOrg: Int,
) : Organisasi {
    override fun rapat() {
        println("Kei sedang rapat di $namaOrg")
        println("Biaya konsum rapat: ${super.biayaKonsum}")
    }
}