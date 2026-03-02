package week05

class dosen (name: String, val nidn: String, nama: String) : pegawai(name) {

    override fun bekerja() {
        println("[$name] sedang menyiapkan materi perkuliahan dan merivisi RPKPS.")

    }
    fun mengajar() {
        println("[$name] sedang mengajar mahasiswa di kelas.")

    }
}