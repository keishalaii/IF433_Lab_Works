package oop_00000128606_keishaarialai.week06

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jumlahOrg: Int,
    override val namaMatkul: String,
    override val nilaiMatkul: Int,
) : Organisasi, KelasMatkul { //anak dari mahasiswa
    override fun rapat() {
        println("Kei sedang rapat di $namaOrg")
        println("Biaya konsum rapat: ${super.biayaKonsum}")
    }

    override fun penilaian() {
        println("Nilai $namaMatkul punya Kei adalah $nilaiMatkul")
    }

    override fun keaktifan() {
        super<Organisasi>.keaktifan()
        super<KelasMatkul>.keaktifan()
    }
}