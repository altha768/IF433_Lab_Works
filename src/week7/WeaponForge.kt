package week7


class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            // Pastikan GameItem dan ItemRarity sudah dibuat di file lain
            val sword = GameItem("Pedang Kayu Lapuk", 5, GameModels.ItemRarity.COMMON)
            return Weapon(sword, 50)
        }

        fun forgeEpicSword(): Weapon {
            val sword = GameItem("Excalibur", 100, GameModels.ItemRarity.EPIC)
            return Weapon(sword, 100)
        }
    }

    fun detail() {
        println("Weapon: ${item.name}, Damage: ${item.damage}, Rarity: ${item.rarity}, Durability: $durability")
    }
}
