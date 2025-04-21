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
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Your favourite food is " + food);
        System.out.println("Your email is " + email);
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is a " + color +" "+ year +" "+ car);
        System.out.println("The price is: "+ currency+price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + "is not for sale");
        }

        /*if(isStudent){
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }
         */
    }
}
