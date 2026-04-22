package oop_00000128606_keishaarialai.week09

fun main() {
    println("\n========= LIST OF =========")
    val ArSiswa = listOf("Budi", "Danu", "Susi", "Cica")
    //view
    println(ArSiswa)

    //panjang array
    println("Banyak Siswa: " + ArSiswa.size)

    //munculin satu orang
    println("Siswa bernama ${ArSiswa[1]}")

    //munculin semua orang -> for each
    for (a in ArSiswa) {
        println("Siswa " + a + " dan ")
    }

    println("\n========= LIST OF MUTABLE =========")
    val ArMatkul = mutableListOf("OOP", "Web", "Math", "Calculus")
    ArMatkul.add("Algo") //add di paling akhir
    ArMatkul[2] = "Aljabar Linear" //ngedit
    ArMatkul.remove("Web") //hapus
    println(ArMatkul)

    println("\n========= SET OF IMUT =========")
    val ArNilai = setOf(80, 90, 75, 85, 80, 30, 50, 85)
    println("Banyak Nilai: ${ArNilai.size}")
    println("Ada angka 90 gak? ${ArNilai.contains(90)}")
    println(ArNilai)

    println("\n========= SET OF MUTABLE =========")
    val ArMahasiswa = mutableSetOf("Andi", "Yanto", "Udin", "Yuda")
    ArMahasiswa.add("Yanti")
    ArMahasiswa.remove("Udin")
    ArMahasiswa.add("Udin") //udin jadi dipindahin di akhir krn udh di remove lalu di add lagi
    println(ArMahasiswa)
}