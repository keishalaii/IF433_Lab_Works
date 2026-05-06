package oop_00000128606_keishaarialai.week11

//fun biasa
fun panggil_nama(nama:String):String{
    return "Hai $nama salam kenal, ya!"
}

//function Extension - BASIC
fun String.panggil_mahasiswa(): String {
    val hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar { c ->
            c.uppercase()
        }
    }
    return hasil
}

// function Extension - PARAMETER
fun Int.tentukanLulus(nama:String):String {
    var keputusan = ""
    if(this >= 70) {
        keputusan = "lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusannya adalah $keputusan"
}

// function Extension - cek NULL
fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty()) {
        return "gak boleh null atau kosong bang"
    } else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa(){ //SCOPE APPLY HARUS PAKE CLASS
    var nim:String? = ""
    var nama:String = ""
    var ipk:Int = 0
}

fun main() {
    //cara panggil function biasa
    println("====================")
    println(panggil_nama("Keii"))

    //cara panggil function Extension - BASIC
    println("Hii, nama ku Keisha".panggil_mahasiswa())

    // cara panggil function extension - PARAMETER
    println(90.tentukanLulus("Kei"))

    //panggil function extension - NULL
    var inputUsername: String? = null
    println(inputUsername.cekNulldanEmpty())

    //SCOPE - LET
    var kampusSaya = "UMN"
    kampusSaya.let {
        if(it == "UMN")
            println("Kampus " + it + " Keren")
        else {
            println("Mantap $it")
        }
    }

    //SCOPE - RUN
    var alamatSaya = "Gading Serpong"
    alamatSaya.run {
        println("Saya t" + "inggal di " + this)
    }

    //SCOPE - WITH
    var gradeSaya = with(90){
        if(this >= 80) {
            "A"
        } else if(this >= 70) {
            "B"
        } else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya")

    //SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "128606"
        nama = "Keeeishaaa"
        ipk = 4
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipk nya ${dataMahasiswa.ipk}")

    //SCOPE - ALSO
    print("Deret Angka: ")
    var deretAngka = mutableListOf<Int>(80, 70, 75, 68, 65)
    deretAngka.also{
        println("\nSebelum $deretAngka")
    }.add(90)
    println("Setelah $deretAngka")

    print("====================")
}