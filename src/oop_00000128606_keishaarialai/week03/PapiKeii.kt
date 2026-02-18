package oop_00000128606_keishaarialai.week03

//W3_TheoryPraktek

open class PapiKeii { //pakai open utnuk membuat anak baru
    private var nama: String = "Belum tau"
    private var umur: Int = 35
    private var umurValid: Boolean = true //suapaya gak ke print 35 nya
    protected var gaji: Int = 10000 //protected artinya yg bisa akses cuma yg berada di class itu sendiri (class turunan)

    public var uangJajan: Int = 0

        set(value) {
            if (value < 0) {
                println("masa uang jajan 0 atau minus :(")
            } else
                field = value
        }

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

class AnakPapii: PapiKeii() {
    fun dapetin_gajiPapi(): Int{
        return this.gaji + 25000 //kalo mau ditambah berapa gitu
    }
}

fun main() {
    var papi = PapiKeii()
    papi.set_nama("Lai")
    papi.set_umur(55)

    var kei = AnakPapii()
    kei.dapetin_gajiPapi()

    println("Nama Ayah: ${papi.get_nama()}\nUmur Ayah: ${papi.get_umur()}\nGaji Ayah: ${kei.dapetin_gajiPapi()}")
    kei.uangJajan = -10000
}
