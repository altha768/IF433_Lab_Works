package oop_00000136220_altha.week02

import java.util.Scanner

// --- DEFINISI CLASS (Pastikan Class Hero ada di file Hero.kt) ---

class Student(
    val name: String,
    val nim: String,
    val major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }
    }
}

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

// --- PROGRAM UTAMA ---

fun main() {
    val scanner = Scanner(System.`in`)

    // 1. BAGIAN PMB UMN
    println("=== [MODULE 1: APLIKASI PMB UMN] ===")
    print("Masukkan Nama Mahasiswa: ")
    val studentName = scanner.nextLine()

    print("Masukkan NIM (5 karakter): ")
    val nimInput = scanner.nextLine()

    if (nimInput.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val majorInput = scanner.nextLine()
        val s1 = Student(studentName, nimInput, majorInput)

        println("\n--- Detail Mahasiswa ---")
        println("Nama: ${s1.name} | NIM: ${s1.nim} | Jurusan: ${s1.major}")
    }

    println("\n" + "=".repeat(40) + "\n")

    // 2. BAGIAN LIBRARY FINE SYSTEM
    println("=== [MODULE 2: LIBRARY FINE SYSTEM] ===")
    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrowerName = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = if (scanner.hasNextInt()) scanner.nextInt() else 1
    scanner.nextLine() // Membersihkan buffer setelah nextInt()

    if (duration < 0) duration = 1

    val currentLoan = Loan(title, borrowerName, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku    : ${currentLoan.bookTitle}")
    println("Peminjam      : ${currentLoan.borrower}")
    println("Lama Pinjam   : ${currentLoan.loanDuration} hari")
    println("Total Denda   : Rp ${currentLoan.calculateFine()}")

    println("\n" + "=".repeat(40) + "\n")

    // 3. BAGIAN MINI RPG BATTLE
    println("=== [MODULE 3: MINI RPG BATTLE] ===")
    var enemyHp = 100

    print("Masukkan Nama Hero Anda: ")
    val heroName = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val baseDmg = if (scanner.hasNextInt()) scanner.nextInt() else 20

    val myHero = Hero(heroName, baseDmg)

    println("\n--- PERTEMPURAN DIMULAI ---")
    while (myHero.isAlive() && enemyHp > 0) {
        println("\nSTATUS: ${myHero.name} (${myHero.hp} HP) vs Musuh ($enemyHp HP)")
        println("Menu: 1. Serang | 2. Kabur")
        print("Pilihan: ")
        val choice = if (scanner.hasNextInt()) scanner.nextInt() else 2

        if (choice == 1) {
            // Hero menyerang
            myHero.attack("Musuh")
            enemyHp -= myHero.baseDamage

            // Musuh membalas jika masih hidup
            if (enemyHp > 0) {
                val dmgMusuh = (10..20).random()
                println("Musuh membalas! $heroName menerima $dmgMusuh damage.")
                myHero.takeDamage(dmgMusuh)
            }
        } else {
            println("Kamu kabur dari arena!")
            break
        }
    }

    // Hasil Akhir RPG
    println("\n--- HASIL PERTEMPURAN ---")
    if (!myHero.isAlive()) {
        println("GAME OVER: ${myHero.name} telah kalah.")
    } else if (enemyHp <= 0) {
        println("VICTORY: ${myHero.name} berhasil mengalahkan musuh!")
    } else {
        println("Pertempuran berakhir tanpa pemenang.")
    }
}