package oop_00000128606_keishaarialai.week04

fun main(){
    var sushiEnak = Sushi()
    sushiEnak.jual_makanan()
    sushiEnak.sushi_terjual(jns = "Roll", jml = 3)

    var ramenEnak = Ramen()
    ramenEnak.jual_makanan()
    ramenEnak.ramen_terjual(jml = 6)
}