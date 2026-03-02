package week05

import com.sun.jdi.Method

open class Pegawai(val nama: String) {
    open fun bekerja() {
        println("$nama sedang melakukan tugas kantor.")
    }
}

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("Dosen $nama (NIDN: $nidn) sedang mengajar di kelas.")
    }

    fun mengajar() {
        println("=> $nama sedang memberikan materi.")
    }
}

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("Admin $nama sedang mengelola administrasi.")
    }

    fun doAdminWork() {
        println("=> $nama sedang menyusun dokumen.")
    }
}

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIFITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {

        pegawai.bekerja()


        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()

            }
        }
        println("---------------------")

        println("\n--- Testing MathHelper ---")

        val helper = MathHelper()

        val luasPersegi = helper.hitungLuas(5)
        println("Luas persegi: (sisi 5) : $luasPersegi")

        val LuasPersegiPanjang = helper.hitungLuas(12, 4)
        println("Luas Persegi Panjang (12x4): $LuasPersegiPanjang")


        val luasLingkaran = helper.hitungLuas(8.0)
        println("Luas Lingkaran: (r 8.0): $luasLingkaran")

        val dompetDigital = EWallet(accountName = "Bakhri E-Wallet", balance = 700000.0)
        val kartuKredit = CreditCard(accountName = "Bakhri E-wallet", limit = 2000000.0)

        val daftarPembayaran: List<PaymentMethod> = listOf(dompetDigital, kartuKredit)

        println("=== SIMULASI TRANSAKSI E-COMMERCE (tagihan: Rp80.000) ===")

        for (metode in daftarPembayaran) {
            metode.prosesPayment(8000.0)
            println("---------------------------------------")
        }

    }
}