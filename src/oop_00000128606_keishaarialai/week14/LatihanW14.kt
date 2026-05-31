package oop_00000128606_keishaarialai.week14

//classnya harus dipisah biar tidak kecampur2
class khs_mahasiswa {
    fun hitung_tugas(quiz: Double, tugasHarian: Double):Double {
        return (quiz*0.3) + (tugasHarian*0.7)
    }
    fun hitung_nilaiAkhir(uts: Double, uas: Double, tugas: Double, jamanPilih: bobot_persen_jaman):Double {
// cara yg salah
//        if(jamanCovid==false){
//            return (uts*0.3) + (uas*0.4) + (tugas*0.3)
//        } else {
//            return (uts*0.2) + (uas*0.3) + (tugas*0.5)
//        }
        return jamanPilih.bobot_nilai_jaman(uts, uas, tugas)
    }
}

//manage with OCP
interface bobot_persen_jaman {
    fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double): Double
}

class jamanCovid: bobot_persen_jaman {
    override fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*0.2) + (uas*0.3) + (tugas*0.4)
    }
}

class jamanNormal: bobot_persen_jaman {
    override fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*0.3) + (uas*0.4) + (tugas*0.3)
    }
}

class simpan_khs {
    fun simpan_nilaiDB(nim: String, nama: String, nilaiAkhir: Double) {
        println("Data si $nim $nama dengan nilai akhir $nilaiAkhir disimpan")
    }
    fun load_nilaiDB(nim: String) {
        println("Berikut data mahasiswa dengan nim $nim")
    }
}

//manage with DIP
class manager_khsMhs {
    fun hitung_khsMhs(quizMhs: Double, tugasHarianMhs: Double, utsMhs: Double, uasMhs: Double): Double {
        val khsMhs = khs_mahasiswa()
        val rataTugas: Double = khsMhs.hitung_tugas(quizMhs, tugasHarianMhs)
        return khsMhs.hitung_nilaiAkhir(utsMhs, uasMhs, rataTugas, jamanNormal())
    }
}

class DB_khsMhs {
    fun saveKhsMhs(nim: String, nama: String, nilai: Double) {
        println("Mahasiswa dengan nim $nim $nama nilainya $nilai, berhasil disimpan!")
    }
}

fun main() {
    val mngKhs = manager_khsMhs()
    val NAMhs1 = mngKhs.hitung_khsMhs(80.50, 70.54, 85.70, 81.36)
    val NAMhs2 = mngKhs.hitung_khsMhs(83.32, 54.66, 95.90, 60.36)

    val dbKhsMhs = DB_khsMhs()
    dbKhsMhs.saveKhsMhs("111", "Kei", NAMhs1)
    dbKhsMhs.saveKhsMhs("222", "Rapi", NAMhs2)
}



