package oop_00000136220_altha.week02

class student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double =0.0,


    ){
    class Student( val name : String,val nim : String, major : String, var studentId: String)
    init {

        if (nim.length != 5) {
        } else {
            println("WARNING: Objek terciptakan dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")

            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }





    }
}