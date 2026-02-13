package oop_00000128606_keishaarialai.week02

class pemain {
    var nama = "Kei"
    var speed = 9
    val shoot: Int = 8

    init {
        nama = "Rapii" //namanya ikutin disini
        println("\nini adalah constructor pertama")
    }

    constructor(namaLengkap: String = "Ciyen", kecepatan: Int = 4) {
        nama = namaLengkap
        speed = kecepatan
        println("ini adalah constructor kedua")
    }

    fun bawa_bola(){ //ini kerangkanya, klo print di main
        println("si $nama sedang membawa bola")
    }
}

fun main() {
    val player1 = pemain(namaLengkap = "Cimut",10) //parameter, apa yg diminta print
    player1.bawa_bola()
    println("nama pemain: ${player1.nama}")
    println("speed pemain: " + player1.speed)

    val player2 = pemain(namaLengkap = "Oyen",12)
    player2.bawa_bola()
    println("nama pemain: ${player2.nama}")
    println("speed pemain: ${player2.speed}")
}