package oop_00000128606_keishaarialai.week03

//W3_TheoryPraktek

class PapiKeii {
    private var nama: String = "Belum tau"
    private var umur: Int = 35
    private var umurValid: Boolean = true

    fun set_nama(namaBaru: String) {
        if (namaBaru.isBlank()) {
            println("Eh nama gaboleh kosong")
        } else {
            this.nama = namaBaru
        }
    }

    fun set_umur(umurBaru: Int) {
        if (umurBaru < -5) {
            println("umur tidak boleh dibawah -5 yaa")
            umurValid = false
        } else {
            this.umur = umurBaru
            umurValid = true
        }
    }

    fun get_nama(): String {
        return nama
    }

    fun get_umur(): String {
        return if (umurValid) umur.toString()
        else "tidak diketahui"
    }
}


fun main() {
    var papi = PapiKeii()
    papi.set_nama("Lai")
    papi.set_umur(-7)
    println("Nama ayah kamu ${papi.get_nama()} Umur-nya ${papi.get_umur()}") //bisa pake (+ papi.nama) juga
}
