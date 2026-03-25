package oop_00000128606_keishaarialai.week07

import java.net.NetworkInterface

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //instansiasi lewat factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Kei", 20)
    val reg2 = RegularUser("Kei", 20)
    println(reg1) //mencetak memori hash
    println("Sama? ${reg1 == reg2}") //false

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Kei", 20)
    val data2 = DataUser("Kei", 20)
    println(data1) //otomatis readable format
    println("Sama? ${data1 == data2}") //true

    val data3 = data1.copy("Kei", 19)
    println("Hasil copy: $data3")
    val (userName, userAge) = data1 //Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success ("Data berhasil di tarik!")
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()
}