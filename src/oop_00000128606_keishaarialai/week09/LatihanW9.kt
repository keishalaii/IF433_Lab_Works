package oop_00000128606_keishaarialai.week09

fun main() {
    println("========= LIST OF =========")
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
}