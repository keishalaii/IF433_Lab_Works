package oop_00000128606_keishaarialai.week13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class Mahasiswa(val nim: String, val nama: String, val nilai: Int) {
    fun simpanDanConvertCSV(): String {
        return "$nim\n$nama\n$nilai"
    }
}

fun main() {
    println(" === CARA 2 - BUAT FILE ")
    val mhs = Mahasiswa( nim = "111", nama = "Kei", nilai = 90)
    val listMhs: List<Mahasiswa> = listOf(
        Mahasiswa( nim = "345", nama = "Keisha", nilai = 90),
        Mahasiswa( nim = "787", nama = "Aria", nilai = 88),
        Mahasiswa( nim = "787", nama = "Lai", nilai = 98),
    )
    val file5 = File("src/week13/datamahasiswa.csv")
    file5.writeText(mhs.simpanDanConvertCSV())

    println(" === CARA 1 BACA ISI FILE === ")
    val file1 = File("src/week13/contohfile.txt")
    val isiContent = file1.readText()
    println(isiContent)

    println(" === CARA 2 BACA ISI FILE === ")
    val contentsaya = file1.readLines()
    contentsaya.forEach { println(it) }

    println(" === CARA 3 BACA ISI FILE - BUFERRED READER === ")
    val file2 = BufferedReader(FileReader("src/week13/contohfile.txt"))
    var isifile: String? = file2.readText();
    while (isifile != null) {
        println(isifile)
        isifile = file2.readLine()
    }

    println(" === CARA 4 - BACA ISI FILE - BUFERRED READER(ver use) === ")
    val file3 = File("src/week13/contohfile.txt").bufferedReader()
    file3.use {
        it.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach { println(it) }
    }

    println(" === CARA 1 - BUAT FILE ")
    val filesaya = File("src/week13/Filedatasaya.txt")
    filesaya.writeText("saya suka ke pasar\nBeli buah dan sayuran")

    filesaya.appendText("\nUntuk ayah dan ib\nDan kakak adik");

    val ListBelanjaan = listOf("Ayam", "Pisang", "Beras");
    filesaya.appendText(ListBelanjaan.joinToString("\n"))

    // ISI DAN MENIMPA FILE
    filesaya.printWriter().use{
        it.println("saya kuliah diumn")
        it.println("UMN kampus keren")
        it.println("saya jurusan Informatika")
    }
}