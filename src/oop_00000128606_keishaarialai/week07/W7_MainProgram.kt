package oop_00000128606_keishaarialai.week07

fun main() {
    println("Server: ${Koneksi.LinkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama = "Kei"
    val na:Int = Mahasiswa.set_nilai(80,100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("UMN")

    //format berantakan
    val Dsn1 = Dosen("Indah", "12345", 2020)
    println(Dsn1)
    val Dsn2 = Dsn1.copy(nama = "Budi", nik = "23456")
    println(Dsn2)

    //cara ambil satu field aja
    println("Nama Dosen1: ${Dsn1.nama} masuk tahun ${Dsn1.tahunMasuk}")

    println("Matkul fav Kei: " + MataKuliah.OOP.name)
    println("Index matkul: " + MataKuliah.OOP.ordinal)

}