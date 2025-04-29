import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class rockscissorpaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("***********************************");
        System.out.println("Welcome to Rock Paper Scissor game!");
        System.out.println("***********************************");

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        do {
            System.out.print("Enter your move(rock,paper,scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.print("Do you want play again!(yes or no)");
            playAgain=scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));
        //System.out.println("Computer choice: " + computerChoice);
        System.out.println("***************");
        System.out.println("Thanks For Play");
        System.out.println("***************");

        scanner.close();
    }
}
