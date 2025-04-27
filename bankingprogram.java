import java.sql.SQLOutput;
import java.util.Scanner;

public class bankingprogram {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;
    public static void main(String[] args) {
        // JAVA BANKING PROGRAM FOR BEGINNERS


        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("****************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {

        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }

    }

    static double withdraw() {

        double amount;
        System.out.print("Enter an amount to be withdraw: ");
        amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("You haven't enough balance");
            return 0;
        } else {
            return amount;
        }
    }

}
