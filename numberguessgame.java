import java.util.Scanner;
import java.util.Random;

public class numberguessgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int guessnumber=0;
        int number;
        int guess=0;
        number = random.nextInt(100) + 1;
        System.out.println("Number Guessing Game");

        do {
            System.out.print("Enter a guess (1~100): ");
            guessnumber = scanner.nextInt();
            if (guessnumber < number) {
                System.out.println("too low");
            } else if (guessnumber > number) {
                System.out.println("too high");
            }
            guess++;
        }while(guessnumber != number);


        System.out.println("Your number is: " + guessnumber);
        System.out.println("Computer number is: " + number);
        System.out.printf("You guessed %d times\n",guess);
        System.out.println("You have won!");


        scanner.close();

    }
}
