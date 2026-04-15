package oop_00000128606_keishaarialai.week08

class set_krs(val nim:String, val kodematkul: String?){
    fun matkul_wajib(sks:Int?){
        println("Matkul kamu $kodematkul sksnya adalah $sks")
    }
}

fun main() {
    var nama: String? = "Keisha"
    nama = null
    println("Hai $nama")

    val settingKRS= set_krs("128606",  "null")
    println("NIM kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(null)
}

//NOTE: Safe Casting (as?), Safe Call (?.), Elvis Operator (?:), Not-Null Assertion (!!)