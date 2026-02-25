package oop_00000128606_keishaarialai.week04

class Ramen:Restoran() { //harus pakai restorannya. kalo enggak pakai, ga dianggap sebagai anak
    private var toping: String = ""
    public fun ramen_terjual(jml:Int) {
        this.toping = "nori"
        super.harga = jml * 120
        println("Ramen $toping laris $harga")
    }

    override public fun jual_makanan() { //pakai override karena penamaan "public fun jual_makanan()" itu sama
        println("saya jual Ramen enak")
    }
}