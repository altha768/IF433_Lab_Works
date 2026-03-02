package week7

class GameExecutor {
    
    fun processEvent(event: BattleEvent.BattleState) {
        when (event) {
            is BattleEvent.BattleState.SafeZone -> {
                println(" Memasuki Safe Zone... Kamu bisa beristirahat.")
            }
            is BattleEvent.BattleState.MonsterEncounter -> {
                println("Awas! Muncul monster ${event.monsterName}!")
            }
            is BattleEvent.BattleState.LootDropped -> {
                
                println("Mendapat loot: ${event.item.name} [Rarity: ${event.item.rarity}]")
            }
            is BattleEvent.BattleState.GameOver -> {
                println(" GAME OVER: ${event.reason}")
            }
        }
    }
}

fun main() {
    val executor = GameExecutor()
    val sword = GameModels.GameItem(
        "Excalibur", "Legendary",
        rarity = TODO(),
    )

    
    executor.processEvent(BattleEvent.BattleState.MonsterEncounter("Goblin King"))
    executor.processEvent(BattleEvent.BattleState.LootDropped(sword))
    executor.processEvent(BattleEvent.BattleState.SafeZone)
}