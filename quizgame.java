import java.util.Scanner;

public class quizgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char guess;
        int score = 0;
        String[] question = {"1.What is the main function of a router?",
                "2.Which part of the computer is considered the brain?",
                "3.What year was Facebook launched?",
                "4.Who is known as the father of computer?",
                "5.What was the first programming language?"};
        String[][] options = {{"  A.Storing files", "  B.Encrypting data", "  C.Directing internet traffic", "  D.Managing passwords"},
                {"  A.CPU", "  B.Hard Drive", "  C.RAM", "  D.GPU"},
                {"  A.2000", "  B.2004", "  C.2006", "  D.2008"},
                {"  A.Steve Jobs", "  B.Bill Gates", "  C.Alan Turing", "  D.Charles Babbage"},
                {"  A.COBOL", "  B.C", "  C.Fortran", "  D.Assembly"},
        };
        char[] answer = {'C', 'A', 'B', 'D', 'C'};

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
        System.out.print("\n");
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print(" Enter your guess: ");
            guess = Character.toUpperCase(scanner.nextLine().charAt(0));

            if (guess == answer[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score += 1;
            } else {
                System.out.println("******");
                System.out.println("WRONG!");
                System.out.println("******");
                System.out.println("The right answer is: " + answer[i]);
            }

        }
        System.out.print("Your final score is: " + score + " out of " + question.length);
    }
}
