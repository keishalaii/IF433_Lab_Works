package oop_00000128606_keishaarialai.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== SIMULASI JADWAL MAKAN 1: PAGI ===")
    // Checkpoint 15 & 16: Try-Catch-Finally
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Sistem Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Sistem Error: ${e.message}")
    } catch (e: Exception) {
        println("Sistem Error Umum: ${e.message}")
    }
}