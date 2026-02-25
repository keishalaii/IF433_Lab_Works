package oop_00000128606_keishaarialai.week04

fun main() {
    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager("Keisha", 1000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer("Rapi", 500000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}