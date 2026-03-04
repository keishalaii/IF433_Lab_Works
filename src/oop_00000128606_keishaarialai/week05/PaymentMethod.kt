package oop_00000128606_keishaarialai.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}