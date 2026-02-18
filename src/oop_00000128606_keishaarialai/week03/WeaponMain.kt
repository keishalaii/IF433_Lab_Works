package oop_00000128606_keishaarialai.week03

fun main(){
    val sword = Weapon("Excalibur", 500)
    sword.damage = -50 // harus gagal
    sword.damage = 9999 // harus buat jadi 1000
    println("Damage sekarang: ${sword.damage}")
    println("Tier senjata: ${sword.tier}")
}