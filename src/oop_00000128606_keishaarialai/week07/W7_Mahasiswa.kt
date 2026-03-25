package oop_00000128606_keishaarialai.week07

class Mahasiswa private constructor (val kampus: String) {
    companion object {
        var nama:String = "Siapa"

        fun set_nilai(uts:Int, uas:Int):Int{
            return (uts+uas)/2
        }

        fun isi_nama_kampus(namaUniv: String) {
            Mahasiswa(namaUniv)
        }
    }
    //bagian class biasa (bkn companion object)
    init {
        println("Kei kuliah di $kampus")
    }
}