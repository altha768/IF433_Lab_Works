package oop_00000136220_altha.week02
class loan {

    class Loan(
        val bookTitle: String,
        val borrower: String,
        val loanDuration: Int = 1 // Default argument sesuai instruksi di gambar
    ) {

        fun calculateFine(): Int {
            return if (loanDuration > 3) {
                (loanDuration - 3) * 2000
            } else {
                0
            }
        }
    }
}