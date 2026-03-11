package oop_00000128606_keishaarialai.week06

interface Organisasi {
    val namaOrg: String
    val budgetRapat: Int
    val jumlahOrg: Int
    val biayaKonsum: Int
        get() = budgetRapat * jumlahOrg

    fun rapat()
    fun keaktifan(){
        println("Ih kamu aktif ya")
    }
}