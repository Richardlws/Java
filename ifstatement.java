import java.util.Arrays;

public class ifstatement {
    public static void main(String[] args) {

        //if statement = performs a block of code if its condition is true

        int age = -1;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else {
            System.out.println("You are a child");
        }

    }
}
