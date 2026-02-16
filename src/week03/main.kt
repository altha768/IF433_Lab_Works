package week03

fun main() {

    // --- BAGIAN EMPLOYEE ---
    val e = Employee("Budi")

    e.salary = -1000 // Error: Gaji ditolak
    e.salary = 5000000
    println("Gaji saat ini: ${e.salary}")

    e.increasePerformance()

    println("Pajak (10%): ${e.tax}")

    println("--- Test Error Employee ---")
    e.salary = 5000 // Error: Gaji ditolak
    println("Gaji akhir Budi tetap: ${e.salary}")

    println("\n============================\n")

    // --- BAGIAN WEAPON (TUGAS 1) ---
    // Pastikan class Weapon sudah ada di file Weapon.kt
    val myWeapon = Weapon("DarkSlayer")
    println("Senjata Baru: ${myWeapon.name}")
    println("Damage Awal: ${myWeapon.damage}")
    println("----------------------------")

    // 1. Test Set Damage ke -50 (Harus Gagal)
    println("[Action] Mencoba set damage ke -50...")
    myWeapon.damage = -50
    println("Hasil Damage: ${myWeapon.damage} (Tetap nilai lama)")

    println("----------------------------")

    // 2. Test Set Damage ke 9999 (Harus Jadi 1000)
    println("[Action] Mencoba set damage ke 9999...")
    myWeapon.damage = 9999

    // 3. Print Hasil Akhir & Tier
    println("Damage Akhir: ${myWeapon.damage}")
    println("Tier Senjata: ${myWeapon.tier}")
}