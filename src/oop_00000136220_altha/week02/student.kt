package oop_00000136220_altha.week02

class Student(
    val name: String,
    val nim: String, // Diubah dari Double ke String
    var major: String,
    var gpa: Double = 0.0
) {

    init {

        if (nim.length != 5) {
            println("WARNING: Objek terciptakan dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }
    }
}

fun main() {

    val mhs1 = Student("Altha", "12345", "Informatika", 3.8)
    val mhs2 = Student("Budi", "123", "Sistem Informasi", 3.5)
}