package oop_00000128606_keishaarialai.week08

class alamat(val nomor:Int, val kota: String)
class mahasiswa(val nim:String, val addr:alamat?)

fun main() {
    val almt = alamat(47, "Tangerang")
    val mhs = mahasiswa("211212", almt)
    val defaultAlamat = mhs.addr?.let{
        alamatAsli -> "Sini nih... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}"
    }?:"Gak jelas, gatau dimana"
    println("NIM-nya ${mhs.nim} tinggalnya di ${mhs.addr?.kota}")
}