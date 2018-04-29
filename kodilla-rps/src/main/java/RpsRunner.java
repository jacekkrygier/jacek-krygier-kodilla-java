public class RpsRunner {
    public static void main(String[] args) {
        GameRules gameRules = new GameRules();
        Game game = new Game();
        game.startGame(gameRules);
    }
}