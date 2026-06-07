package oop_00000128606_keishaarialai.week14

import java.io.File
import java.io.FileWriter

// ===== INTERFACES untuk SRP & DIP =====
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

// ===== INTERFACE untuk OCP (Pricing Strategy) =====
interface PricingStrategy {
    fun calculate(price: Double): Double
    fun getTypeName(): String
}

// ===== PRICING STRATEGY IMPLEMENTATIONS =====
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
    override fun getTypeName(): String = "REGULAR"
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
    override fun getTypeName(): String = "VIP"
}

// ===== IMPLEMENTATIONS for SRP/DIP =====

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        // Perbaikan 1: Gunakan FileWriter dengan append mode
        val file = File(filePath)
        val isNewFile = !file.exists()

        FileWriter(filePath, true).use { writer ->
            if (isNewFile) {
                writer.write("Item Name,Final Price,Customer Type\n")
            }
            writer.write("$itemName,$finalPrice,$customerType\n")
        }
        println("Order saved to CSV: $itemName, $finalPrice, $customerType")
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// ===== REFACTORED ORDER PROCESSOR (FINAL) =====
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    // OCP: Menerima PricingStrategy, bukan String customerType
    fun processOrder(itemName: String, basePrice: Double, strategy: PricingStrategy) {
        val finalPrice = strategy.calculate(basePrice)
        val customerType = strategy.getTypeName()

        println("Memproses pesanan $itemName seharga $finalPrice (tipe: $customerType)")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

// ===== MAIN FUNCTION =====
fun main() {
    val csvRepo = CsvOrderRepository()
    val emailNotifier = EmailNotifier()
    val orderProcessor = SafeOrderProcessor(csvRepo, emailNotifier)

    orderProcessor.processOrder("Laptop", 15000.0, RegularPricing())
    orderProcessor.processOrder("Smartphone", 8000.0, VipPricing())
}