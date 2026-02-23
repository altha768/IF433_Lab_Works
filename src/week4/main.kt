package week4

fun main () {
    println("--- Testing Vehicle ---")
    val generatedVehicle = Vehicle(brand = "Sepeda onthel")
    generatedVehicle.accelerate()
    generatedVehicle.honk()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val myEv = ElectricCar("Mercedes",4, 96)
    myEv.accelerate()
    myEv.honk()
    myEv.openTrunk()

    val manager = manager("asep", 6300000)
    val developer = Developer("udin", 9000000, "kotlin")

    manager.work()
    println("Bonus manager: Rp ${manager.calculateBonus()}")
    println("---")

    developer.work()
    println("Bonus Developer Rp ${developer.calculateBonus()}")


}

