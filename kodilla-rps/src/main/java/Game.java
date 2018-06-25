import java.util.Random;

public class Game {

    private String gamer;
    private String gamerChoice;
    private String computerChoice;
    boolean end = false;
    int turn = 0;
    private int gamerScore = 0;
    private int computerScore = 0;




    public void startGame(GameRules gameRules) {
        gamer = gameRules.setGamer();
        int finalRounds = gameRules.setNumberOfWins();

        while(!end){
            if(turn == finalRounds){
                end = true;
            } else {
                System.out.println("\nROUND " + (turn+1));
                startTurn(gameRules);
                turn++;
            }
        }
        endTheGame();
    }

    public void startTurn(GameRules gameRules) {

        gamerChoice = gameRules.getChoice();
        computerChoice = computerChoice();
        System.out.println(gamer + " selected: " + gamerChoice);
        System.out.println("Computer selected: " + computerChoice);
        whoWins(gamerChoice, computerChoice);
        showResult();
    }

    public void showResult() {
        System.out.println("Finished Rounds: " + (turn+1));
        System.out.println(gamer +" points: " + gamerScore);
        System.out.println("Computer points: " + computerScore);
    }


    private void  whoWins(String gamerChoice, String computerChoice) {
        if (gamerChoice.equals("Rock")) {
            if (computerChoice.equals("Rock")) {
                System.out.println("Tie");
            } else if (computerChoice.equals("Scissors")) {
                System.out.println("Rock crashes Scissors. You won.");
                gamerScore++;
            } else {
                System.out.println("Paper covers Rock. Computer won.");
                computerScore++;
            }
        } else if (gamerChoice.equals("Scissors")) {
            if (computerChoice.equals("Scissors")) {
                System.out.println("Tie");
            } else if (computerChoice.equals("Paper")) {
                System.out.println("Scissors cuts Paper. You won.");
                gamerScore++;
            } else {
                System.out.println("Rock crashes Scissors. Computer won.");
                computerScore++;
            }
        } else {
            if (computerChoice.equals("Paper")) {
                System.out.println("Tie");
            } else if (computerChoice.equals("Rock")) {
                System.out.println("Paper covers Rock. You won.");
                gamerScore++;
            } else {
                System.out.println("Scissors cuts Paper. Computer won.");
                computerScore++;
            }
        }
    }

    private String computerChoice() {
        Random random = new Random();
        String[] choice = {"Rock", "Scissors", "Paper"};
        return choice[random.nextInt(3)];
    }

    public void endTheGame(){
        if(gamerScore == computerScore){
            System.out.println("Game finished. It's a tie.");
        }
        if (gamerScore > computerScore) {
            System.out.println("Game finished. Congratulations "+ gamer +"! You won the game.");
        }
        if (gamerScore < computerScore){
            System.out.println("Game finished. Oops! Computer won the game. Better luck next time " + gamer + "!");
        }
    }
}
