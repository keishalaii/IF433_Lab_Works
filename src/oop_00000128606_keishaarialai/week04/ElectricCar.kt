package oop_00000128606_keishaarialai.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors){
    final override fun accelerate() {
        println("$brand mobil impian")
    }
}