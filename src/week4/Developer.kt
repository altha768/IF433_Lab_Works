package week4

// Pastikan file Employee.kt memiliki 'package week4' di baris paling atas
class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {


    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }


}