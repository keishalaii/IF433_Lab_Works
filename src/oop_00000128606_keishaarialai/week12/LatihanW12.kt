package oop_00000128606_keishaarialai.week12

import kotlin.math.sin

// basic exception - Trycatch
fun pembagian(pembilang: Int, penyebut: Int) {
    try {
        val hasilBagi = pembilang / penyebut;
        println("hasilBagi: $hasilBagi");
    } catch (e: Exception) {
        println("Error di pembagian: ${e.message}");
    } finally {
        println("Selesai pembagian ");
    }
}

// exception - expression - tipe data
fun cek_tipe_data() {
    var angka: Int = try {
        Integer.parseInt("10");
    } catch (e: Exception) {
        println("ada err diCekTipeData ${e.message}")
        111
    }
    println("Angka kamu adalah ${angka}");
}


//throw
fun cek_saldo(saldoSaya: Int) {
    if (saldoSaya<1000) {
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak bisa melakukan pendaftaran Bca Prioritas")
    } else {
        println("Selamat kamu masuk daftar bca prioritas");
    }
}

//custom exception
class ceknilaikkm(val kkm: Int, val nilai:Int): Exception("Nilai $nilai berada dibawah kkm $kkm")

class nilai_siswa(val kkm: Int ) {
    fun input_nilai( nilaiKamu: Int) {
        if (nilaiKamu < kkm) {
            throw ceknilaikkm(kkm, nilaiKamu);
        } else  {
            println("kamu lulus, dengan nilai $nilaiKamu ");
        }
    }
}

//multiple catch
fun contoh_multiple_catch(nilai: String) {
    try {
        val angka: Int = Integer.parseInt(nilai);
        val hasil: Int = angka/2;
        println("Hasil nilainya; $hasil");
        cek_saldo(100);
    } catch (e: NumberFormatException) {
        println("eror salah format ${e.message}");
    } catch (e: ArithmeticException) {
        println("eror kesalahan aritmatika ${e.message}");
    } catch (e: Exception) {
        println("eror program ${e.message}");
    }
}

sealed class  ATMException(pesan: String): Exception(pesan) ;

class saldo_dibawah_nol(val saldoKamu: Int): ATMException(pesan = "masa saldo kamu $saldoKamu minus")
class cek_jumlah_saldo(val saldoAwal: Int,  val jajan: Int): ATMException("saldo tinggal $saldoAwal, kamu jajan $jajan, gak cukup bang")

fun mulai_jajan(saldoAwalKamu: Int, jajanKamu: Int): Int {
    if (saldoAwalKamu < jajanKamu) {
        throw cek_jumlah_saldo(saldoAwalKamu, jajanKamu);
    } else if (saldoAwalKamu < 0) {
        throw saldo_dibawah_nol(saldoAwalKamu);
    } else {
        println("Transaksi berhasil !!!")
    }
    return saldoAwalKamu - jajanKamu;
}

fun main() {
    runCatching { mulai_jajan(1000, 980) }
        .onSuccess {println("Transaksi sukses :  $it")}
        .onFailure {println("Transaksi gagal :  $it")}
    mulai_jajan(1000, jajanKamu = 980)

    contoh_multiple_catch( "100")

    //panggil class custom exception
    val nsiswa = nilai_siswa(70)
    nsiswa.input_nilai(71)
    try {
        nsiswa.input_nilai(80);
    } catch (e: Exception) {
        println("ada Error saat input nilai siswa: ${e.message}");
    }

    //coba throw
    try {
        cek_saldo(100)
    }   catch (e: Exception) {
        println("Error dithrow: ${e.message}")
    }
    //expection
    cek_tipe_data()

    pembagian(10, 0)
}