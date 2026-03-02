package week7

class BattleEvent {
    sealed class BattleState {
        data class MonsterEncounter(val monsterName: String) : BattleState()
        data class LootDropped(val item: GameModels.GameItem) : BattleState() // Changed 'sword' to 'item'
        data class GameOver(val reason: String) : BattleState()
        data object SafeZone : BattleState()
    }
}