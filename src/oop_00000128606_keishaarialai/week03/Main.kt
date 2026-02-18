package oop_00000128606_keishaarialai.week03

fun main(){
    val e = Employee("Kei")
    // 1. Test Validasi Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}