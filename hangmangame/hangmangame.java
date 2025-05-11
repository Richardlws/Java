package hangmangame;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class hangmangame {
    public static void main(String[] args) {
        String word = "watermelon";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        //System.out.println(wordState);
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");
        //System.out.println(getHangmanArt(6));
        System.out.print("Word: ");
        for (char c : wordState) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("Guess a letter: ");
        char guess = scanner.next().toLowerCase().charAt(0);
        //System.out.println(guess);
        //System.out.println(word.indexOf(guess));
        if (word.indexOf(guess) >= 0) {


        }

        scanner.close();
    }

    static String getHangmanArt(int WrongGuesses) {

        return switch (WrongGuesses) {
            case 0 -> """
                    
                    
                    
                    
                    """;
            case 1 -> """
                     o
                    
                    
                    """;
            case 2 -> """
                     o 
                     |
                    
                    """;
            case 3 -> """
                     o 
                    /|
                    
                    """;
            case 4 -> """
                     o 
                    /|\\
                    """;
            case 5 -> """
                     o 
                    /|\\
                    /  
                    """;
            case 6 -> """
                     o 
                    /|\\
                    /  \\
                    """;
            default -> "";

        };

    }
}
