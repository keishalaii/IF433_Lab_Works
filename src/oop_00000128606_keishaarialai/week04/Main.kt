package oop_00000128606_keishaarialai.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Ferrari", numberOfDoors = 2)
    myCar.openTrunk() //panggil method milik sendiri
    myCar.honk() //panggil method yg sudah di override
    myCar.accelerate() //panggil gabungan method parent dan child

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 4, 85)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}