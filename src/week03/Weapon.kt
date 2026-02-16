package week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Warning: Damage tidak boleh negatif!")
            } else if (value > 1000) {
                println("System: Damage terlalu OP, dipaksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Tier otomatis berubah saat damage berubah
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}