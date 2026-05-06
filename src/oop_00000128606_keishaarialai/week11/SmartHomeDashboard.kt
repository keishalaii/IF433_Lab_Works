package oop_00000128606_keishaarialai.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lightDevice = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    val feederDevice = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    homeDevices.add(feederDevice)

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }
}