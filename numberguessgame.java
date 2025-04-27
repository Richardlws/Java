import java.util.Scanner;
import java.util.Random;

public class numberguessgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int guessnumber=0;
        int number;
        int guess=0;
        int min = 1;
        int max = 100;
        number = random.nextInt(1,100);
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n",min,max);

        do {
            System.out.print("Enter a guess: ");
            guessnumber = scanner.nextInt();
            if (guessnumber < number) {
                System.out.println("Too Low! Try again");
            } else if (guessnumber > number) {
                System.out.println("too high! Try again");
            }
            guess++;
        }while(guessnumber != number);


        System.out.println("Your number is: " + guessnumber);
        System.out.println("Computer number is: " + number);
        System.out.printf("# of attemps:%d\n",guess);
        System.out.println("You have won!");


        scanner.close();

    }
}
