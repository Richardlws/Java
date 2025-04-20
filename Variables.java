import java.sql.SQLSyntaxErrorException;

public class Variables {
    public static void main(String[] args) {
        // variable = a reuseable container for a value
        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        if(isStudent){        {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }
    }
}
