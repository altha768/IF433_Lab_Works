package week7

// Change 'annotation class' to 'data class'
data class LootDropped(val item: GameItem)
data class GameItem(val name: String, val rarity1: Int, val rarity: GameModels.ItemRarity) {
    val damage: String
        get() {
            TODO()
        }
}