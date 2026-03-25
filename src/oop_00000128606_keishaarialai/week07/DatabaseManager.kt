package oop_00000128606_keishaarialai.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server.."
        println("Database is ready.")
    }
}