package musicplayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\java\\musicplayer\\3.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            //System.out.println("No problem detected");
            //clip.start();

            String response="";
            while (!response.equals("Q")) {

                System.out.println("P=Play");
                System.out.println("S=Stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch(response){
                    case "P"-> clip.start();
                    case "S"-> clip.stop();
                    case "R"-> clip.setMicrosecondPosition(0);
                    case "Q"-> clip.close();
                    default-> System.out.println("Invalid choice");

                }



            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Bye!");
        }

    }
}
