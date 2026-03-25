package oop_00000128606_keishaarialai.week07

fun main() {
    println("Server: ${Koneksi.LinkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama = "Kei"
    val na:Int = Mahasiswa.set_nilai(80,100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("UMN")
}