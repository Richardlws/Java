import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String email;
        String domain;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        if (email.contains("@")) {
            domain = email.substring((email.indexOf("@") + 1));
            System.out.println("Your email is valid");
            System.out.println("Your email is: " + email);
            System.out.println("The domain is " + domain);
        } else {

            System.out.println("Email must contain @ ");

        }

        //String username = email.substring(0, email.indexOf(("@")));

        //String domain = email.substring(email.indexOf("@") + 1);

        //System.out.println(username);
        //System.out.println(domain);
        scanner.close();
    }
}
