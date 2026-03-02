package week7

class GameModels {

    enum class ItemRarity (val dropChance: Int) {
        COMMON(80),
        UNCOMMON(45),
        RARE(31),
        EPIC(20),
        LEGENDARY(5),

    }

    data class GameItem(
        val name: String,
        val damage: String,
        val rarity: ItemRarity,
    )
}