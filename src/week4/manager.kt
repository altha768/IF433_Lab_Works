package week4

class manager(name: String, baseSalary: Int): Employee(name,baseSalary){

    override fun work() {
        println("$name work sedang memimpin rapat")

    }
    override fun calculateBonus(): Int {

        return super.calculateBonus() + 5000000
    }
}