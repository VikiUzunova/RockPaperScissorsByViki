import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playerChosenMove = "";
        String compMove = "";

        int computerRandomNumber = random.nextInt(4);
        System.out.print("Choose [r]ock,n[p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();

        switch (playerMove){
            case "r", "rock", "Rock" -> playerChosenMove = ROCK;
            case "p", "paper", "Paper" -> playerChosenMove = PAPER;
            case "s", "scissors", "Scissors" -> playerChosenMove = SCISSORS;
            default -> {
                System.out.println("Invalid. Input. Try Again...");
            }
        }
        switch (computerRandomNumber){
            case 1 -> compMove = ROCK;
            case 2 -> compMove = PAPER;
            case 3 -> compMove = SCISSORS;
        }
        System.out.printf("The computer chose %s.%n", compMove);

        if ((playerChosenMove.equals("Rock") && compMove.equals("Scissors")) ||
                (playerChosenMove.equals("Paper") && compMove.equals("Rock")) ||
                (playerChosenMove.equals("Scissors") && compMove.equals("Paper"))) {
            System.out.println("You win!");
        } else if ((playerChosenMove.equals("Rock") && compMove.equals("Rock")) ||
                (playerChosenMove.equals("Paper") && compMove.equals("Paper")) ||
                (playerChosenMove.equals("Scissors") && compMove.equals("Scissors"))) {
            System.out.println("This game was a draw.");
        } else if ((playerChosenMove.equals("Rock") && compMove.equals("Paper")) ||
                (playerChosenMove.equals("Paper") && compMove.equals("Scissors")) ||
                (playerChosenMove.equals("Scissors") && compMove.equals("Rock"))) {
            System.out.println("You lost.");
        }
    }
}
