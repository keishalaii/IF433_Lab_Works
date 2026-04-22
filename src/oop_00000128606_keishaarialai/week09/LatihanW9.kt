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

    println("\n========= MAP IMUT =========")
    val ArResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur Asem" to 2500
    )
    println("Banyak menu ${ArResto.size}")
    println("Harga Ayam ${ArResto["Ayam"]}")
    println("List makanan: ${ArResto.keys}")
    println("List harga: ${ArResto.values}")
    println(ArResto)

    println("\n========= MAP MUTABLE =========")
    val ArKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    )
    ArKHS.remove("Ara")
    ArKHS["Nika"] = 92 //edit
    ArKHS["Cinta"] = 99 //add
    println(ArKHS)

    println("\n========= LAMBDA =========")
    //function biasa
    fun tambah(a:Int, b:Int):Int {
        return a + b
    }
    println("Hasil penambahan 5+3 adalah ${tambah(a = 5, b = 3)}")

    //function lambda -> tulisnya horizontal
    val kurang = { a: Int, b: Int -> a-b }
    println("Hasil pengurangan 5-3 adalah ${kurang(5, 3)}")

    println("\n========= LAMBDA { IT } =========")
    val pangkat = {a: Int -> a*a}
    val hasilPangkat:(Int) -> Int = {it * it}
    println("Hasil pangkat 5 adalah ${hasilPangkat(5)}")

    println("\n========= FOREACH BIASA =========")
    for (a in ArMatkul) {
        println(a)
    }

    println("\n========= FOREACH IT =========")
    ArMatkul.forEach {
        println(it)
    }

    println("\n========= FOREACH VARIABLE =========")
    ArMatkul.forEach {
        mk -> println(mk)
    }
}