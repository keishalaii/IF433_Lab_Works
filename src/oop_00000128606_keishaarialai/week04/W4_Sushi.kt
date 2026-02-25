package oop_00000128606_keishaarialai.week04

class Sushi:Restoran() { //ditambahin class induknya
    private var jenis:String = ""
    public fun sushi_terjual(jns:String, jml:Int) {
        this.jenis = jns //this sebenrnya ga wajib (kalo penamaannya berbeda)
        harga = jml * 100
        println("Sushi $jenis laku $harga")
    }
}