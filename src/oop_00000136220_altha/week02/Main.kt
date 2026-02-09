package oop_00000136220_altha.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        return
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Memanggil constructor lengkap
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {
        // Memanggil constructor yang hanya butuh name & nim
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

    } else {
        println("Pilihan tidak valid, pendaftaran dibatalkan!")
    }
}

// DEFINISI CLASS STUDENT DENGAN DEFAULT VALUE
class Student(
    val name: String,
    val nim: String,
    // Kita beri nilai default "Umum" untuk major dan 0.0 untuk gpa
    val major: String = "Umum",
    val gpa: Double = 0.0
) {
    init {
        println("LOG: Objek student $name berhasil dialokasikan di memory.")
    }
}