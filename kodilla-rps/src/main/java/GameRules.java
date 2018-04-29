import java.util.Scanner;

public class GameRules {

    private int numberOfRounds;
    private String gamerName;


    String setGamer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Rock, Paper, Scissor, Game!\nEnter your name, please:");
        String gamerName = scanner.nextLine();
        return gamerName;
    }

    public  int setNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rounds, please: ");
        int numberOfRounds = scanner.nextInt();
        return numberOfRounds;
    }

    public String getGamerName() {
        return gamerName;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public String getChoice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select: R for Rock, S for Scissors or P for Paper");
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "R": return "Rock";
                case "S": return "Scissors";
                case "P": return "Paper";
            }
            System.out.println("Wrong selection");
        }
    }
}


