package oop_00000128606_keishaarialai.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0823442")
    val admin1 = Admin(nama = "Bu Siti")

    // polymorphic collection: list yg berisi tipe parent, tapi isinya object anak
    val daftarPegawai: List <Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        //pemanggilan runtime polymorphism
        pegawai.bekerja()

        //smart casting dengan is dan when
        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() //smart cast! tdk perlu manual casting
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.PekerjaanAdmin()
            }
        }
        println("----------------------------------------------")
    }
}