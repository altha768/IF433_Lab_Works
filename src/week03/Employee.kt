package week03

class Employee(val name: String) {
    var salary: Int = 1000000
        set(value) {
            if (value < 1000000) {
                println("Error: Gaji Rp$value tidak valid! (Minimal Rp1.000.000)")
            } else {
                field = value
            }
        }

    // TAX ERROR FIX: Gunakan get() agar menjadi Computed Property
    val tax: Double
        get() = salary * 0.1

    // INCREASEPERFORMANCE ERROR FIX:
    // 1. Samakan nama fungsi dengan di main (P besar)
    // 2. Gunakan .toInt() karena hasil perkalian 1.1 adalah Double
    fun increasePerformance() {
        println("Performa $name meningkat! Memberikan bonus 10%...")
        this.salary = (this.salary * 1.1).toInt()
    }
}