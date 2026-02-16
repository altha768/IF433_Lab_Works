package oop_00000136220_altha.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0  // Tidak ada denda jika <= 3 har
        }
    }

    // Method tambahan untuk menampilkan informasi peminjaman
    fun displayInfo() {
        println("=================================")
        println("Informasi Peminjaman Buku")
        println("=================================")
        println("Judul Buku    : $bookTitle")
        println("Peminjam      : $borrower")
        println("Durasi Pinjam : $loanDuration hari")
        println("Denda         : Rp ${calculateFine()}")
        println("=================================\n")
    }
}

// Fungsi main untuk testing program
fun main() {
    println("===== PROGRAM PENCATAT PEMINJAMAN BUKU =====\n")

    // Contoh 1: Peminjaman dengan default duration (1 hari)
    val loan1 = Loan("Laskar Pelangi", "Budi")
    loan1.displayInfo()

    // Contoh 2: Peminjaman 3 hari (tidak ada denda)
    val loan2 = Loan("Bumi Manusia", "Ani", 3)
    loan2.displayInfo()

    // Contoh 3: Peminjaman 5 hari (ada denda)
    val loan3 = Loan("Perahu Kertas", "Siti", 5)
    loan3.displayInfo()

    // Contoh 4: Peminjaman 7 hari (denda lebih besar)
    val loan4 = Loan("Negeri 5 Menara", "Joko", 7)
    loan4.displayInfo()

    // Menampilkan perhitungan denda
    println("===== RINGKASAN DENDA =====")
    println("${loan1.borrower} - ${loan1.bookTitle}: Rp ${loan1.calculateFine()}")
    println("${loan2.borrower} - ${loan2.bookTitle}: Rp ${loan2.calculateFine()}")
    println("${loan3.borrower} - ${loan3.bookTitle}: Rp ${loan3.calculateFine()}")
    println("${loan4.borrower} - ${loan4.bookTitle}: Rp ${loan4.calculateFine()}")
}

