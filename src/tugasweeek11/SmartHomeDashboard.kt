package tugasweeek11

fun setupSmartHome() {
    val homeDevices = mutableListOf<SmartDevice>()

    val light = SmartDevice("Initial", "None").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // CHECKPOINT 15: "week11: (task) configure Ezviz camera with also"
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }


    val acInverter = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acInverter)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))


    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices) {
        println("Ukuran list perangkat: ${this.size}")
    }


    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total Daya: $totalPower Watt")

    println("\n--- Menjalankan Iterasi Dashboard ---")
    homeDevices.forEach {
        println(it.diagnose())
    }
}