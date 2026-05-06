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

    with(homeDevices) {
        println("=== SMART HOME DASHBOARD SUMMARY ===")
        println("Total perangkat terdaftar: ${this.size} perangkat")
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total beban daya saat ini: $totalPower Watt")

    //testing
    println("\n=== DETAIL SEMUA PERANGKAT ===")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }
}

//HASIL OUTPUT:

//(LOG) Kamera terhubung
//[DIAGNOSTIK] Ezviz Outdoor | Kategori: Camera | Status: Online | Daya: 5 Watt
//=== SMART HOME DASHBOARD SUMMARY ===
//Total perangkat terdaftar: 4 perangkat
//Total beban daya saat ini: 827 Watt

//=== DETAIL SEMUA PERANGKAT ===
//[DIAGNOSTIK] Philips WiZ Living Room | Kategori: Lighting | Status: Online | Daya: 12 Watt
//[DIAGNOSTIK] Ezviz Outdoor | Kategori: Camera | Status: Online | Daya: 5 Watt
//[DIAGNOSTIK] Daikin Inverter (Kabel 3x2.5) | Kategori: HVAC | Status: Offline | Daya: 800 Watt
//[DIAGNOSTIK] Picolo's Auto Feeder | Kategori: Pet Care | Status: Online | Daya: 10 Watt