package oop_00000128606_keishaarialai.week10

import oop_00000128606_keishaarialai.week08.alamat

//Code Non-Generic
class rumah(val alamat:Any) //Any bisa menampung semua tipe data

//Code Generic
class kampus<T>(val alamat:T) //artinya sama seperti Any, tetapi khusus untuk code generic.
// T bisa diganti huruf lain jg

//Code Generic - Multi Parameter
class computer<T, V>(val merk:T, val barcode:V) //kalau sama sama pake T juga boleh

//Code Generic - Function
fun <T> Password(isiPass: T):T{
    return isiPass
}

//Code Generic - Function Constraint
class kalkulator<T:Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt()
    }

    fun kurang(): Double {
        return a.toDouble() - b.toDouble()
    }
}

//Generic - WHERE
fun <T> penilaian(list: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter{it >= kkm}
}

fun main() {
    println("\n=== SAMPLE NON-GENERIC ===")
//    val rmh = rumah(alamat = "Gading Serpong")
    val rmh = rumah(alamat = 200)
    println("Angka awal: ${rmh.alamat}")
    //kalau mau ditambah sbg integer bisa gini
    val angkaRumah = rmh.alamat as Int
    println("Angka setelah ditambah: ${angkaRumah + 50}")

    println("\n=== SAMPLE GENERIC ===")
    val kmps = kampus(alamat = "Tangerang")
    println(kmps.alamat)

    println("\n=== SAMPLE GENERIC - MULTI PARAMETER ===")
    val comp = computer(merk = "Dell", barcode = 12345)
    println("Merk Komputer: " + comp.merk)
    println("Barcode Komputer: ${comp.barcode}")

    println("\n=== SAMPLE GENERIC - FUNCTION ===")
    println("Password kamu: " + Password(isiPass = "128606"))

    println("\n=== SAMPLE GENERIC - FUNCTION CONSTRAINT ===")
    val kalk = kalkulator(10.52,20.347)
    println("Penambahan ${kalk.a} ditambah ${kalk.b}: " + kalk.tambah())
    println("Pengurangan ${kalk.a} dikurang ${kalk.b}: " + kalk.kurang())

    println("\n=== SAMPLE GENERIC - WHERE ===")
    val daftarNilai = listOf(60, 71, 90, 83, 73, 67, 55, 84, 72)
    println("Daftar nilai: " + daftarNilai)
    val nilaiAtaskkm = penilaian(daftarNilai, kkm = 70)
    println("Nilai diatas kkm: " + nilaiAtaskkm)
}