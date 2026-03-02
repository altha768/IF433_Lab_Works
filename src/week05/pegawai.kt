package week05

abstract class pegawai(val name: String) {
    abstract fun bekerja()

    companion object {
        val doAdminwork: Any
            get() {
                TODO()
            }

        fun mengajar() {}
    }
}