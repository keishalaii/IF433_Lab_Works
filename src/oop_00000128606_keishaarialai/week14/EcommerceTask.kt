package oop_00000128606_keishaarialai.week14

import java.io.File

// ===== INTERFACES untuk SRP & DIP =====
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

// ===== IMPLEMENTATIONS =====
class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File(filePath).printWriter().use { writer ->
            writer.appendText("$itemName, $finalPrice, $customerType\n")
        }
        println("Order saved to CSV: $itemName, $finalPrice, $customerType")
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// ===== REFACTORED ORDER PROCESSOR =====
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, finalPrice: Double, customerType: String) {
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}