package oop_00000128606_keishaarialai.week03

fun main(){
    val e = Employee("Kei")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}