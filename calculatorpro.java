import java.util.Scanner;
import static
public class calculatorpro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter  enter num2: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter an operator(+,-,*,/,^): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = pow(num1,num2);
            System.out.print("The result is: " + result);


        }


        scanner.close();


    }
}
