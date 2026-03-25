package oop_00000128606_keishaarialai.week07

import java.net.NetworkInterface

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //instansiasi lewat factory
    client.connect()
}