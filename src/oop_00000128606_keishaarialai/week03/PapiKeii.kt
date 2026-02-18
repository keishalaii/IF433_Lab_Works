package oop_00000128606_keishaarialai.week03

//W3_TheoryPraktek

class PapiKeii {
    public var nama: String = "Belum tau"
    public var umur: Int = 35
}

fun main() {
    var papi = PapiKeii()
    papi.nama = "Lai"
    papi.umur = 55
    println("Nama ayah kamu: ${papi.nama} umur-nya ${papi.umur}") //bisa pake (+ papi.nama) juga
}