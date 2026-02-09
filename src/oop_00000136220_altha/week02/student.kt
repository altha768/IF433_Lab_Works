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
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Perbaikan: Memanggil class Student yang sudah didefinisikan di bawah
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}

// WAJIB ADA: Definisi class Student di luar fungsi main
class Student(
    val name: String,
    val nim: String,
    val major: String
) {
    init {
        println("LOG: Objek student $name berhasil dialokasikan di memory.")
    }
}