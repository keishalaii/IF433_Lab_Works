package oop_00000128606_keishaarialai.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lightDevice = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}