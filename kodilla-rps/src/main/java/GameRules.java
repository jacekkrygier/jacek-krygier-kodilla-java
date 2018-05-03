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
            System.out.println("Select: 1 for Rock, 2 for Paper, 3 for Scissors, x for end of the game, n for the new game");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": return "Rock";
                case "2": return "Paper";
                case "3": return "Scissors";
                case "x": return ending();
            }
            System.out.println("Wrong selection");
        }
    }

    public String ending() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("You want to quit the game. Are you sure? Select 1 for Yes or 2 for No");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return "Yes";
                case "2":
                    return "No";
            }
            System.out.println("Wrong selection");
        }



    }


}


