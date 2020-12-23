fun main() {
    val game: Game = Game()
    val player1 = Player("csisl")
    game.addPlayer(player1)
    game.incrementScore(player1, "blue")
    game.decrementScore(player1, "red")
    game.incrementScore(player1, "red")
    game.incrementScore(player1, "red")
    game.displayScore()
}