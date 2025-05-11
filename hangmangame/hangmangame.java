package hangmangame;

import java.util.Scanner;
import java.util.ArrayList;

public class hangmangame {
    public static void main(String[] args) {
        String word = "watermelon";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i =0;i<word.length();i++){
            wordState.add('_');
        }
        //System.out.println(wordState);
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");





        scanner.close();
    }
}
